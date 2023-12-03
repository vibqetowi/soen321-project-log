package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.storage.internal.Util;
import java.io.UnsupportedEncodingException;
import v9.o;
/* loaded from: classes.dex */
public class FirebaseStorage {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String STORAGE_BUCKET_WITH_PATH_EXCEPTION = "The storage Uri cannot contain a path element.";
    private static final String STORAGE_URI_PARSE_EXCEPTION = "The storage Uri could not be parsed.";
    private static final String TAG = "FirebaseStorage";
    private zd.a emulatorSettings;
    private final sc.e mApp;
    private final re.b<cd.b> mAppCheckProvider;
    private final re.b<gd.b> mAuthProvider;
    private final String mBucketName;
    private long sMaxUploadRetry = 600000;
    private long sMaxChunkUploadRetry = 60000;
    private long sMaxDownloadRetry = 600000;
    private long sMaxQueryRetry = 120000;

    public FirebaseStorage(String str, sc.e eVar, re.b<gd.b> bVar, re.b<cd.b> bVar2) {
        this.mBucketName = str;
        this.mApp = eVar;
        this.mAuthProvider = bVar;
        this.mAppCheckProvider = bVar2;
        if (bVar2 != null && bVar2.get() != null) {
            bVar2.get().a(new cd.a() { // from class: com.google.firebase.storage.FirebaseStorage.1
                @Override // cd.a
                public void onAppCheckTokenChanged(zc.c cVar) {
                }
            });
        }
    }

    private String getBucketName() {
        return this.mBucketName;
    }

    public static FirebaseStorage getInstance() {
        return getInstance(sc.e.e());
    }

    private static FirebaseStorage getInstanceImpl(sc.e eVar, Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (uri != null && !TextUtils.isEmpty(uri.getPath())) {
            throw new IllegalArgumentException(STORAGE_BUCKET_WITH_PATH_EXCEPTION);
        }
        if (eVar != null) {
            FirebaseStorageComponent firebaseStorageComponent = (FirebaseStorageComponent) eVar.c(FirebaseStorageComponent.class);
            o.i(firebaseStorageComponent, "Firebase Storage component is not present.");
            return firebaseStorageComponent.get(str);
        }
        throw new NullPointerException("Provided FirebaseApp must not be null.");
    }

    public sc.e getApp() {
        return this.mApp;
    }

    public cd.b getAppCheckProvider() {
        re.b<cd.b> bVar = this.mAppCheckProvider;
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    public gd.b getAuthProvider() {
        re.b<gd.b> bVar = this.mAuthProvider;
        if (bVar != null) {
            return bVar.get();
        }
        return null;
    }

    public zd.a getEmulatorSettings() {
        return this.emulatorSettings;
    }

    public long getMaxChunkUploadRetry() {
        return this.sMaxChunkUploadRetry;
    }

    public long getMaxDownloadRetryTimeMillis() {
        return this.sMaxDownloadRetry;
    }

    public long getMaxOperationRetryTimeMillis() {
        return this.sMaxQueryRetry;
    }

    public long getMaxUploadRetryTimeMillis() {
        return this.sMaxUploadRetry;
    }

    public StorageReference getReference() {
        if (!TextUtils.isEmpty(getBucketName())) {
            return getReference(new Uri.Builder().scheme("gs").authority(getBucketName()).path("/").build());
        }
        throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
    }

    public StorageReference getReferenceFromUrl(String str) {
        o.a("location must not be null or empty", !TextUtils.isEmpty(str));
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("gs://") && !lowerCase.startsWith("https://") && !lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException(STORAGE_URI_PARSE_EXCEPTION);
        }
        try {
            Uri normalize = Util.normalize(this.mApp, str);
            if (normalize != null) {
                return getReference(normalize);
            }
            throw new IllegalArgumentException(STORAGE_URI_PARSE_EXCEPTION);
        } catch (UnsupportedEncodingException e10) {
            Log.e(TAG, "Unable to parse location:".concat(str), e10);
            throw new IllegalArgumentException(STORAGE_URI_PARSE_EXCEPTION);
        }
    }

    public void setMaxChunkUploadRetry(long j10) {
        this.sMaxChunkUploadRetry = j10;
    }

    public void setMaxDownloadRetryTimeMillis(long j10) {
        this.sMaxDownloadRetry = j10;
    }

    public void setMaxOperationRetryTimeMillis(long j10) {
        this.sMaxQueryRetry = j10;
    }

    public void setMaxUploadRetryTimeMillis(long j10) {
        this.sMaxUploadRetry = j10;
    }

    public void useEmulator(String str, int i6) {
        this.emulatorSettings = new zd.a(str, i6);
    }

    public static FirebaseStorage getInstance(String str) {
        return getInstance(sc.e.e(), str);
    }

    public static FirebaseStorage getInstance(sc.e eVar) {
        o.a("Null is not a valid value for the FirebaseApp.", eVar != null);
        eVar.b();
        sc.f fVar = eVar.f31434c;
        String str = fVar.f;
        if (str == null) {
            return getInstanceImpl(eVar, null);
        }
        try {
            StringBuilder sb2 = new StringBuilder("gs://");
            eVar.b();
            sb2.append(fVar.f);
            return getInstanceImpl(eVar, Util.normalize(eVar, sb2.toString()));
        } catch (UnsupportedEncodingException e10) {
            Log.e(TAG, "Unable to parse bucket:".concat(str), e10);
            throw new IllegalArgumentException(STORAGE_URI_PARSE_EXCEPTION);
        }
    }

    public StorageReference getReference(String str) {
        o.a("location must not be null or empty", !TextUtils.isEmpty(str));
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("gs://") && !lowerCase.startsWith("https://") && !lowerCase.startsWith("http://")) {
            return getReference().child(str);
        }
        throw new IllegalArgumentException("location should not be a full URL.");
    }

    private StorageReference getReference(Uri uri) {
        if (uri != null) {
            String bucketName = getBucketName();
            o.a("The supplied bucketname does not match the storage bucket of the current instance.", TextUtils.isEmpty(bucketName) || uri.getAuthority().equalsIgnoreCase(bucketName));
            return new StorageReference(uri, this);
        }
        throw new NullPointerException("uri must not be null");
    }

    public static FirebaseStorage getInstance(sc.e eVar, String str) {
        o.a("Null is not a valid value for the FirebaseApp.", eVar != null);
        o.a("Null is not a valid value for the Firebase Storage URL.", str != null);
        if (str.toLowerCase().startsWith("gs://")) {
            try {
                return getInstanceImpl(eVar, Util.normalize(eVar, str));
            } catch (UnsupportedEncodingException e10) {
                Log.e(TAG, "Unable to parse url:".concat(str), e10);
                throw new IllegalArgumentException(STORAGE_URI_PARSE_EXCEPTION);
            }
        }
        throw new IllegalArgumentException("Please use a gs:// URL for your Firebase Storage bucket.");
    }
}
