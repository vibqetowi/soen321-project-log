package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.StreamDownloadTask;
import com.google.firebase.storage.internal.Slashes;
import com.google.firebase.storage.internal.StorageReferenceUri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import v9.o;
/* loaded from: classes.dex */
public class StorageReference implements Comparable<StorageReference> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "StorageReference";
    private final FirebaseStorage mFirebaseStorage;
    private final Uri mStorageUri;

    public StorageReference(Uri uri, FirebaseStorage firebaseStorage) {
        boolean z10;
        if (uri != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.a("storageUri cannot be null", z10);
        o.a("FirebaseApp cannot be null", firebaseStorage != null);
        this.mStorageUri = uri;
        this.mFirebaseStorage = firebaseStorage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ya.h<ListResult> listHelper(Integer num, String str) {
        ya.i iVar = new ya.i();
        StorageTaskScheduler.getInstance().scheduleCommand(new ListTask(this, num, str, iVar));
        return iVar.f38392a;
    }

    public StorageReference child(String str) {
        o.a("childName cannot be null or empty", !TextUtils.isEmpty(str));
        return new StorageReference(this.mStorageUri.buildUpon().appendEncodedPath(Slashes.preserveSlashEncode(Slashes.normalizeSlashes(str))).build(), this.mFirebaseStorage);
    }

    public ya.h<Void> delete() {
        ya.i iVar = new ya.i();
        StorageTaskScheduler.getInstance().scheduleCommand(new DeleteStorageTask(this, iVar));
        return iVar.f38392a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StorageReference)) {
            return false;
        }
        return ((StorageReference) obj).toString().equals(toString());
    }

    public List<FileDownloadTask> getActiveDownloadTasks() {
        return StorageTaskManager.getInstance().getDownloadTasksUnder(this);
    }

    public List<UploadTask> getActiveUploadTasks() {
        return StorageTaskManager.getInstance().getUploadTasksUnder(this);
    }

    public sc.e getApp() {
        return getStorage().getApp();
    }

    public String getBucket() {
        return this.mStorageUri.getAuthority();
    }

    public ya.h<byte[]> getBytes(final long j10) {
        final ya.i iVar = new ya.i();
        StreamDownloadTask streamDownloadTask = new StreamDownloadTask(this);
        streamDownloadTask.setStreamProcessor(new StreamDownloadTask.StreamProcessor() { // from class: com.google.firebase.storage.StorageReference.3
            @Override // com.google.firebase.storage.StreamDownloadTask.StreamProcessor
            public void doInBackground(StreamDownloadTask.TaskSnapshot taskSnapshot, InputStream inputStream) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[16384];
                    int i6 = 0;
                    while (true) {
                        int read = inputStream.read(bArr, 0, 16384);
                        if (read != -1) {
                            i6 += read;
                            if (i6 <= j10) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                Log.e(StorageReference.TAG, "the maximum allowed buffer size was exceeded.");
                                throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                            }
                        } else {
                            byteArrayOutputStream.flush();
                            iVar.b(byteArrayOutputStream.toByteArray());
                            return;
                        }
                    }
                } finally {
                    inputStream.close();
                }
            }
        }).addOnSuccessListener((ya.f) new ya.f<StreamDownloadTask.TaskSnapshot>() { // from class: com.google.firebase.storage.StorageReference.2
            @Override // ya.f
            public void onSuccess(StreamDownloadTask.TaskSnapshot taskSnapshot) {
                if (iVar.f38392a.isComplete()) {
                    return;
                }
                Log.e(StorageReference.TAG, "getBytes 'succeeded', but failed to set a Result.");
                iVar.a(StorageException.fromErrorStatus(Status.B));
            }
        }).addOnFailureListener(new ya.e() { // from class: com.google.firebase.storage.StorageReference.1
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // ya.e
            public void onFailure(Exception exc) {
                iVar.a(StorageException.fromExceptionAndHttpCode(exc, 0));
            }
        });
        streamDownloadTask.queue();
        return iVar.f38392a;
    }

    public ya.h<Uri> getDownloadUrl() {
        ya.i iVar = new ya.i();
        StorageTaskScheduler.getInstance().scheduleCommand(new GetDownloadUrlTask(this, iVar));
        return iVar.f38392a;
    }

    public FileDownloadTask getFile(Uri uri) {
        FileDownloadTask fileDownloadTask = new FileDownloadTask(this, uri);
        fileDownloadTask.queue();
        return fileDownloadTask;
    }

    public ya.h<StorageMetadata> getMetadata() {
        ya.i iVar = new ya.i();
        StorageTaskScheduler.getInstance().scheduleCommand(new GetMetadataTask(this, iVar));
        return iVar.f38392a;
    }

    public String getName() {
        String path = this.mStorageUri.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            return path.substring(lastIndexOf + 1);
        }
        return path;
    }

    public StorageReference getParent() {
        String path = this.mStorageUri.getPath();
        if (!TextUtils.isEmpty(path)) {
            String str = "/";
            if (!path.equals("/")) {
                int lastIndexOf = path.lastIndexOf(47);
                if (lastIndexOf != -1) {
                    str = path.substring(0, lastIndexOf);
                }
                return new StorageReference(this.mStorageUri.buildUpon().path(str).build(), this.mFirebaseStorage);
            }
            return null;
        }
        return null;
    }

    public String getPath() {
        return this.mStorageUri.getPath();
    }

    public StorageReference getRoot() {
        return new StorageReference(this.mStorageUri.buildUpon().path("").build(), this.mFirebaseStorage);
    }

    public FirebaseStorage getStorage() {
        return this.mFirebaseStorage;
    }

    public StorageReferenceUri getStorageReferenceUri() {
        return new StorageReferenceUri(this.mStorageUri, this.mFirebaseStorage.getEmulatorSettings());
    }

    public Uri getStorageUri() {
        return this.mStorageUri;
    }

    public StreamDownloadTask getStream() {
        StreamDownloadTask streamDownloadTask = new StreamDownloadTask(this);
        streamDownloadTask.queue();
        return streamDownloadTask;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public ya.h<ListResult> list(int i6) {
        o.a("maxResults must be greater than zero", i6 > 0);
        o.a("maxResults must be at most 1000", i6 <= 1000);
        return listHelper(Integer.valueOf(i6), null);
    }

    public ya.h<ListResult> listAll() {
        final ya.i iVar = new ya.i();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final Executor commandPoolExecutor = StorageTaskScheduler.getInstance().getCommandPoolExecutor();
        listHelper(null, null).continueWithTask(commandPoolExecutor, new ya.b<ListResult, ya.h<Void>>() { // from class: com.google.firebase.storage.StorageReference.4
            @Override // ya.b
            public ya.h<Void> then(ya.h<ListResult> hVar) {
                if (hVar.isSuccessful()) {
                    ListResult result = hVar.getResult();
                    arrayList.addAll(result.getPrefixes());
                    arrayList2.addAll(result.getItems());
                    if (result.getPageToken() != null) {
                        StorageReference.this.listHelper(null, result.getPageToken()).continueWithTask(commandPoolExecutor, this);
                    } else {
                        iVar.b(new ListResult(arrayList, arrayList2, null));
                    }
                } else {
                    iVar.a(hVar.getException());
                }
                return ya.k.e(null);
            }
        });
        return iVar.f38392a;
    }

    public UploadTask putBytes(byte[] bArr) {
        o.a("bytes cannot be null", bArr != null);
        UploadTask uploadTask = new UploadTask(this, (StorageMetadata) null, bArr);
        uploadTask.queue();
        return uploadTask;
    }

    public UploadTask putFile(Uri uri) {
        o.a("uri cannot be null", uri != null);
        UploadTask uploadTask = new UploadTask(this, null, uri, null);
        uploadTask.queue();
        return uploadTask;
    }

    public UploadTask putStream(InputStream inputStream) {
        o.a("stream cannot be null", inputStream != null);
        UploadTask uploadTask = new UploadTask(this, (StorageMetadata) null, inputStream);
        uploadTask.queue();
        return uploadTask;
    }

    public String toString() {
        return "gs://" + this.mStorageUri.getAuthority() + this.mStorageUri.getEncodedPath();
    }

    public ya.h<StorageMetadata> updateMetadata(StorageMetadata storageMetadata) {
        o.h(storageMetadata);
        ya.i iVar = new ya.i();
        StorageTaskScheduler.getInstance().scheduleCommand(new UpdateMetadataTask(this, iVar, storageMetadata));
        return iVar.f38392a;
    }

    @Override // java.lang.Comparable
    public int compareTo(StorageReference storageReference) {
        return this.mStorageUri.compareTo(storageReference.mStorageUri);
    }

    public FileDownloadTask getFile(File file) {
        return getFile(Uri.fromFile(file));
    }

    public StreamDownloadTask getStream(StreamDownloadTask.StreamProcessor streamProcessor) {
        StreamDownloadTask streamDownloadTask = new StreamDownloadTask(this);
        streamDownloadTask.setStreamProcessor(streamProcessor);
        streamDownloadTask.queue();
        return streamDownloadTask;
    }

    public ya.h<ListResult> list(int i6, String str) {
        o.a("maxResults must be greater than zero", i6 > 0);
        o.a("maxResults must be at most 1000", i6 <= 1000);
        o.a("pageToken must be non-null to resume a previous list() operation", str != null);
        return listHelper(Integer.valueOf(i6), str);
    }

    public UploadTask putBytes(byte[] bArr, StorageMetadata storageMetadata) {
        o.a("bytes cannot be null", bArr != null);
        o.a("metadata cannot be null", storageMetadata != null);
        UploadTask uploadTask = new UploadTask(this, storageMetadata, bArr);
        uploadTask.queue();
        return uploadTask;
    }

    public UploadTask putFile(Uri uri, StorageMetadata storageMetadata) {
        o.a("uri cannot be null", uri != null);
        o.a("metadata cannot be null", storageMetadata != null);
        UploadTask uploadTask = new UploadTask(this, storageMetadata, uri, null);
        uploadTask.queue();
        return uploadTask;
    }

    public UploadTask putStream(InputStream inputStream, StorageMetadata storageMetadata) {
        o.a("stream cannot be null", inputStream != null);
        o.a("metadata cannot be null", storageMetadata != null);
        UploadTask uploadTask = new UploadTask(this, storageMetadata, inputStream);
        uploadTask.queue();
        return uploadTask;
    }

    public UploadTask putFile(Uri uri, StorageMetadata storageMetadata, Uri uri2) {
        o.a("uri cannot be null", uri != null);
        o.a("metadata cannot be null", storageMetadata != null);
        UploadTask uploadTask = new UploadTask(this, storageMetadata, uri, uri2);
        uploadTask.queue();
        return uploadTask;
    }
}
