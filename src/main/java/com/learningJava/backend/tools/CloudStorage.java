package com.learningJava.backend.tools;

import com.learningJava.backend.Constants;
import com.google.api.gax.paging.Page;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import static com.google.api.client.util.Charsets.UTF_8;

public class CloudStorage {
    Storage storage;
    Credentials credentials;
    Bucket bucket;

    BlobInfo blobInfo;
    public CloudStorage () throws IOException {
        credentials = GoogleCredentials
                .fromStream(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(Constants.websiteKey)));

        storage = StorageOptions.newBuilder().setCredentials(credentials)
                .setProjectId(Constants.projectId).build().getService();
    }

    public void writeData (String blobName, String bucketName, String value){
        BlobId blobId = BlobId.of(bucketName, blobName);
        bucket = storage.get(bucketName);

        if (bucket == null){
            bucket = storage.create(BucketInfo.newBuilder(bucketName).build());
        }
        if (storage.get(blobId) != null) {
            storage.get(blobId).delete();
        }

        blobInfo = BlobInfo.newBuilder(blobId).setContentType("text/plain").build();
        storage.create(blobInfo, value.getBytes(UTF_8));
    }
    public String readData (String blobName, String bucketName){
        BlobId blobId = BlobId.of(bucketName, blobName);

        if (storage.get(blobId) == null) {
            return null;
        }

        System.out.println("Reading Data: " + new String(storage.get(blobId).getContent()));
        return new String(storage.get(blobId).getContent());
    }
    public ArrayList<ArrayList<String>> readBucketValues(String bucketName) {
        bucket = storage.get(bucketName);

        ArrayList<ArrayList<String>> returnedArrayList = new ArrayList<>();
        if (bucket == null) {
            return null;
        }
        Page<Blob> blobs = bucket.list();

        returnedArrayList.add(new ArrayList<>());

        int i = 0;
        for (Blob blob : blobs.getValues()) {
            returnedArrayList.add(new ArrayList<>());
            returnedArrayList.get(i).add(blob.getName());
            returnedArrayList.get(i).add(new String(blob.getContent()));
            i++;
        }

        return returnedArrayList;
    }
    public ArrayList<String> readBucketBlobNames(String bucketName) {
        bucket = storage.get(bucketName);

        ArrayList<String> returnedArrayList = new ArrayList<>();
        if (bucket == null) {
            return null;
        }
        Page<Blob> blobs = bucket.list();

        for (Blob blob : blobs.getValues()) {
            returnedArrayList.add(blob.getName());
        }

        return returnedArrayList;
    }
    public void deleteData (String blobName, String bucketName, String value) {
        BlobId blobId = BlobId.of(bucketName, blobName);
        if (storage.get(blobId) != null) {
            if (new String(storage.get(blobId).getContent()).equals(value)) {
                storage.get(blobId).delete();
            }
        }
    }
    public void deleteData (String blobName, String bucketName) {
        BlobId blobId = BlobId.of(bucketName, blobName);
        if (storage.get(blobId) != null) {
            storage.get(blobId).delete();
        }
    }
    public void deleteAllDataInBucket (String bucketName) {
        bucket = storage.get(bucketName);
        Page<Blob> blobs = bucket.list();
        for (Blob blob : blobs.iterateAll()) {
            blob.delete();
        }
    }
}
