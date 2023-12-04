package com.facebook.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* compiled from: FileLruCache.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 )2\u00020\u0001:\b'()*+,-.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0087\u0002J\u0016\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0019J\u001c\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0007J\b\u0010 \u001a\u00020\u0017H\u0002J\u0018\u0010!\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u000bH\u0002J\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u0003H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/facebook/internal/FileLruCache;", "", "tag", "", "limits", "Lcom/facebook/internal/FileLruCache$Limits;", "(Ljava/lang/String;Lcom/facebook/internal/FileLruCache$Limits;)V", "condition", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "directory", "Ljava/io/File;", "isTrimInProgress", "", "isTrimPending", "lastClearCacheTime", "Ljava/util/concurrent/atomic/AtomicLong;", FirebaseAnalytics.Param.LOCATION, "getLocation", "()Ljava/lang/String;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "clearCache", "", "get", "Ljava/io/InputStream;", FileLruCache.HEADER_CACHEKEY_KEY, "contentTag", "interceptAndPut", "input", "openPutStream", "Ljava/io/OutputStream;", "postTrim", "renameToTargetAndTrim", "buffer", "sizeInBytesForTest", "", "toString", "trim", "BufferFile", "CloseCallbackOutputStream", "Companion", "CopyingInputStream", "Limits", "ModifiedFile", "StreamCloseCallback", "StreamHeader", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FileLruCache {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_CACHEKEY_KEY = "key";
    private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
    private static final String TAG;
    private static final AtomicLong bufferIndex;
    private final Condition condition;
    private final File directory;
    private boolean isTrimInProgress;
    private boolean isTrimPending;
    private final AtomicLong lastClearCacheTime;
    private final Limits limits;
    private final ReentrantLock lock;
    private final String tag;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLruCache.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FileLruCache$StreamCloseCallback;", "", "onClose", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface StreamCloseCallback {
        void onClose();
    }

    public final InputStream get(String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        return get$default(this, key, null, 2, null);
    }

    public final OutputStream openPutStream(String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        return openPutStream$default(this, key, null, 2, null);
    }

    public FileLruCache(String tag, Limits limits) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.tag = tag;
        this.limits = limits;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        File file = new File(FacebookSdk.getCacheDir(), tag);
        this.directory = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.lastClearCacheTime = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            BufferFile.INSTANCE.deleteAll(file);
        }
    }

    public final long sizeInBytesForTest() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                if (!this.isTrimPending && !this.isTrimInProgress) {
                    break;
                }
                try {
                    this.condition.await();
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Unit unit = Unit.INSTANCE;
        reentrantLock.unlock();
        File[] listFiles = this.directory.listFiles();
        long j = 0;
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file = listFiles[i];
                i++;
                j += file.length();
            }
        }
        return j;
    }

    public static /* synthetic */ InputStream get$default(FileLruCache fileLruCache, String str, String str2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.get(str, str2);
    }

    public final InputStream get(String key, String str) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        File file = this.directory;
        Utility utility = Utility.INSTANCE;
        File file2 = new File(file, Utility.md5hash(key));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 8192);
            boolean z = false;
            try {
                JSONObject readHeader = StreamHeader.INSTANCE.readHeader(bufferedInputStream);
                if (readHeader == null) {
                    bufferedInputStream.close();
                    return null;
                } else if (!Intrinsics.areEqual(readHeader.optString(HEADER_CACHEKEY_KEY), key)) {
                    bufferedInputStream.close();
                    return null;
                } else {
                    String optString = readHeader.optString("tag", null);
                    if (str == null && !Intrinsics.areEqual(str, optString)) {
                        bufferedInputStream.close();
                        return null;
                    }
                    long time = new Date().getTime();
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str2 = TAG;
                    companion.log(loggingBehavior, str2, "Setting lastModified to " + time + " for " + ((Object) file2.getName()));
                    file2.setLastModified(time);
                    try {
                        return bufferedInputStream;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            bufferedInputStream.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static /* synthetic */ OutputStream openPutStream$default(FileLruCache fileLruCache, String str, String str2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.openPutStream(str, str2);
    }

    public final OutputStream openPutStream(final String key, String str) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        final File newFile = BufferFile.INSTANCE.newFile(this.directory);
        newFile.delete();
        if (!newFile.createNewFile()) {
            throw new IOException(Intrinsics.stringPlus("Could not create file at ", newFile.getAbsolutePath()));
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(newFile);
            final long currentTimeMillis = System.currentTimeMillis();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new CloseCallbackOutputStream(fileOutputStream, new StreamCloseCallback() { // from class: com.facebook.internal.FileLruCache$openPutStream$renameToTargetCallback$1
                @Override // com.facebook.internal.FileLruCache.StreamCloseCallback
                public void onClose() {
                    AtomicLong atomicLong;
                    long j = currentTimeMillis;
                    atomicLong = this.lastClearCacheTime;
                    if (j >= atomicLong.get()) {
                        this.renameToTargetAndTrim(key, newFile);
                    } else {
                        newFile.delete();
                    }
                }
            }), 8192);
            boolean z = false;
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(HEADER_CACHEKEY_KEY, key);
                    Utility utility = Utility.INSTANCE;
                    if (!Utility.isNullOrEmpty(str)) {
                        jSONObject.put("tag", str);
                    }
                    StreamHeader.INSTANCE.writeHeader(bufferedOutputStream, jSONObject);
                    z = true;
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    Logger.Companion.log(LoggingBehavior.CACHE, 5, TAG, Intrinsics.stringPlus("Error creating JSON header for cache file: ", e));
                    throw new IOException(e.getMessage());
                }
            } catch (Throwable th) {
                if (!z) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            Logger.Companion.log(LoggingBehavior.CACHE, 5, TAG, Intrinsics.stringPlus("Error creating buffer output stream: ", e2));
            throw new IOException(e2.getMessage());
        }
    }

    public final void clearCache() {
        final File[] listFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
        this.lastClearCacheTime.set(System.currentTimeMillis());
        if (listFiles != null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.internal.FileLruCache$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    FileLruCache.m6389clearCache$lambda1(listFiles);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearCache$lambda-1  reason: not valid java name */
    public static final void m6389clearCache$lambda1(File[] filesToDelete) {
        Intrinsics.checkNotNullExpressionValue(filesToDelete, "filesToDelete");
        int length = filesToDelete.length;
        int i = 0;
        while (i < length) {
            File file = filesToDelete[i];
            i++;
            file.delete();
        }
    }

    public final String getLocation() {
        String path = this.directory.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "directory.path");
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renameToTargetAndTrim(String str, File file) {
        File file2 = this.directory;
        Utility utility = Utility.INSTANCE;
        if (!file.renameTo(new File(file2, Utility.md5hash(str)))) {
            file.delete();
        }
        postTrim();
    }

    public final InputStream interceptAndPut(String key, InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return new CopyingInputStream(input, openPutStream$default(this, key, null, 2, null));
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.tag + " file:" + ((Object) this.directory.getName()) + AbstractJsonLexerKt.END_OBJ;
    }

    private final void postTrim() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.isTrimPending) {
                this.isTrimPending = true;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.internal.FileLruCache$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        FileLruCache.m6390postTrim$lambda3$lambda2(FileLruCache.this);
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: postTrim$lambda-3$lambda-2  reason: not valid java name */
    public static final void m6390postTrim$lambda3$lambda2(FileLruCache this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.trim();
    }

    private final void trim() {
        long j;
        ModifiedFile modifiedFile;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isTrimPending = false;
            this.isTrimInProgress = true;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            try {
                Logger.Companion.log(LoggingBehavior.CACHE, TAG, "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] listFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
                long j2 = 0;
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    j = 0;
                    while (i < length) {
                        File file = listFiles[i];
                        i++;
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        priorityQueue.add(new ModifiedFile(file));
                        Logger.Companion.log(LoggingBehavior.CACHE, TAG, "  trim considering time=" + modifiedFile.getModified() + " name=" + ((Object) modifiedFile.getFile().getName()));
                        j2 += file.length();
                        j++;
                        listFiles = listFiles;
                    }
                } else {
                    j = 0;
                }
                while (true) {
                    if (j2 <= this.limits.getByteCount() && j <= this.limits.getFileCount()) {
                        this.lock.lock();
                        try {
                            this.isTrimInProgress = false;
                            this.condition.signalAll();
                            Unit unit2 = Unit.INSTANCE;
                            return;
                        } finally {
                        }
                    }
                    File file2 = ((ModifiedFile) priorityQueue.remove()).getFile();
                    Logger.Companion.log(LoggingBehavior.CACHE, TAG, Intrinsics.stringPlus("  trim removing ", file2.getName()));
                    j2 -= file2.length();
                    j--;
                    file2.delete();
                }
            } catch (Throwable th) {
                this.lock.lock();
                try {
                    this.isTrimInProgress = false;
                    this.condition.signalAll();
                    Unit unit3 = Unit.INSTANCE;
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLruCache.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/FileLruCache$BufferFile;", "", "()V", "FILE_NAME_PREFIX", "", "filterExcludeBufferFiles", "Ljava/io/FilenameFilter;", "filterExcludeNonBufferFiles", "deleteAll", "", "root", "Ljava/io/File;", "excludeBufferFiles", "excludeNonBufferFiles", "newFile", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class BufferFile {
        private static final String FILE_NAME_PREFIX = "buffer";
        public static final BufferFile INSTANCE = new BufferFile();
        private static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter() { // from class: com.facebook.internal.FileLruCache$BufferFile$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m6391filterExcludeBufferFiles$lambda0;
                m6391filterExcludeBufferFiles$lambda0 = FileLruCache.BufferFile.m6391filterExcludeBufferFiles$lambda0(file, str);
                return m6391filterExcludeBufferFiles$lambda0;
            }
        };
        private static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter() { // from class: com.facebook.internal.FileLruCache$BufferFile$$ExternalSyntheticLambda1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m6392filterExcludeNonBufferFiles$lambda1;
                m6392filterExcludeNonBufferFiles$lambda1 = FileLruCache.BufferFile.m6392filterExcludeNonBufferFiles$lambda1(file, str);
                return m6392filterExcludeNonBufferFiles$lambda1;
            }
        };

        private BufferFile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: filterExcludeBufferFiles$lambda-0  reason: not valid java name */
        public static final boolean m6391filterExcludeBufferFiles$lambda0(File file, String filename) {
            Intrinsics.checkNotNullExpressionValue(filename, "filename");
            return !StringsKt.startsWith$default(filename, FILE_NAME_PREFIX, false, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: filterExcludeNonBufferFiles$lambda-1  reason: not valid java name */
        public static final boolean m6392filterExcludeNonBufferFiles$lambda1(File file, String filename) {
            Intrinsics.checkNotNullExpressionValue(filename, "filename");
            return StringsKt.startsWith$default(filename, FILE_NAME_PREFIX, false, 2, (Object) null);
        }

        public final void deleteAll(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            File[] listFiles = root.listFiles(excludeNonBufferFiles());
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file = listFiles[i];
                    i++;
                    file.delete();
                }
            }
        }

        public final FilenameFilter excludeBufferFiles() {
            return filterExcludeBufferFiles;
        }

        public final FilenameFilter excludeNonBufferFiles() {
            return filterExcludeNonBufferFiles;
        }

        public final File newFile(File file) {
            return new File(file, Intrinsics.stringPlus(FILE_NAME_PREFIX, Long.valueOf(FileLruCache.bufferIndex.incrementAndGet())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLruCache.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/internal/FileLruCache$StreamHeader;", "", "()V", "HEADER_VERSION", "", "readHeader", "Lorg/json/JSONObject;", "stream", "Ljava/io/InputStream;", "writeHeader", "", "Ljava/io/OutputStream;", "header", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class StreamHeader {
        private static final int HEADER_VERSION = 0;
        public static final StreamHeader INSTANCE = new StreamHeader();

        private StreamHeader() {
        }

        public final void writeHeader(OutputStream stream, JSONObject header) throws IOException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            Intrinsics.checkNotNullParameter(header, "header");
            String jSONObject = header.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "header.toString()");
            byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            stream.write(0);
            stream.write((bytes.length >> 16) & 255);
            stream.write((bytes.length >> 8) & 255);
            stream.write((bytes.length >> 0) & 255);
            stream.write(bytes);
        }

        public final JSONObject readHeader(InputStream stream) throws IOException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            if (stream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = stream.read();
                if (read == -1) {
                    Logger.Companion.log(LoggingBehavior.CACHE, FileLruCache.Companion.getTAG(), "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read2 = stream.read(bArr, i, i2 - i);
                if (read2 < 1) {
                    Logger.Companion.log(LoggingBehavior.CACHE, FileLruCache.Companion.getTAG(), "readHeader: stream.read stopped at " + i + " when expected " + i2);
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr, Charsets.UTF_8)).nextValue();
                if (!(nextValue instanceof JSONObject)) {
                    Logger.Companion.log(LoggingBehavior.CACHE, FileLruCache.Companion.getTAG(), Intrinsics.stringPlus("readHeader: expected JSONObject, got ", nextValue.getClass().getCanonicalName()));
                    return null;
                }
                return (JSONObject) nextValue;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLruCache.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/FileLruCache$CloseCallbackOutputStream;", "Ljava/io/OutputStream;", "innerStream", "callback", "Lcom/facebook/internal/FileLruCache$StreamCloseCallback;", "(Ljava/io/OutputStream;Lcom/facebook/internal/FileLruCache$StreamCloseCallback;)V", "getCallback", "()Lcom/facebook/internal/FileLruCache$StreamCloseCallback;", "getInnerStream", "()Ljava/io/OutputStream;", "close", "", "flush", "write", "buffer", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "count", "oneByte", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class CloseCallbackOutputStream extends OutputStream {
        private final StreamCloseCallback callback;
        private final OutputStream innerStream;

        public CloseCallbackOutputStream(OutputStream innerStream, StreamCloseCallback callback) {
            Intrinsics.checkNotNullParameter(innerStream, "innerStream");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.innerStream = innerStream;
            this.callback = callback;
        }

        public final StreamCloseCallback getCallback() {
            return this.callback;
        }

        public final OutputStream getInnerStream() {
            return this.innerStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.innerStream.close();
            } finally {
                this.callback.onClose();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.innerStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.innerStream.write(buffer, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] buffer) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.innerStream.write(buffer);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.innerStream.write(i);
        }
    }

    /* compiled from: FileLruCache.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/FileLruCache$CopyingInputStream;", "Ljava/io/InputStream;", "input", "output", "Ljava/io/OutputStream;", "(Ljava/io/InputStream;Ljava/io/OutputStream;)V", "getInput", "()Ljava/io/InputStream;", "getOutput", "()Ljava/io/OutputStream;", "available", "", "close", "", "mark", "readlimit", "markSupported", "", "read", "buffer", "", TypedValues.CycleType.S_WAVE_OFFSET, SessionDescription.ATTR_LENGTH, "reset", "skip", "", "byteCount", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class CopyingInputStream extends InputStream {
        private final InputStream input;
        private final OutputStream output;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        public final InputStream getInput() {
            return this.input;
        }

        public final OutputStream getOutput() {
            return this.output;
        }

        public CopyingInputStream(InputStream input, OutputStream output) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(output, "output");
            this.input = input;
            this.output = output;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.input.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.input.close();
            } finally {
                this.output.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int read = this.input.read(buffer);
            if (read > 0) {
                this.output.write(buffer, 0, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int read = this.input.read();
            if (read >= 0) {
                this.output.write(read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int read = this.input.read(buffer, i, i2);
            if (read > 0) {
                this.output.write(buffer, i, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            int read;
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j && (read = read(bArr, 0, (int) Math.min(j - j2, 1024))) >= 0) {
                j2 += read;
            }
            return j2;
        }
    }

    /* compiled from: FileLruCache.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/facebook/internal/FileLruCache$Limits;", "", "()V", "value", "", "byteCount", "getByteCount", "()I", "setByteCount", "(I)V", "fileCount", "getFileCount", "setFileCount", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Limits {
        private int byteCount = 1048576;
        private int fileCount = 1024;

        public final int getByteCount() {
            return this.byteCount;
        }

        public final void setByteCount(int i) {
            if (i < 0) {
                throw new InvalidParameterException("Cache byte-count limit must be >= 0");
            }
            this.byteCount = i;
        }

        public final int getFileCount() {
            return this.fileCount;
        }

        public final void setFileCount(int i) {
            if (i < 0) {
                throw new InvalidParameterException("Cache file count limit must be >= 0");
            }
            this.fileCount = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLruCache.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/FileLruCache$ModifiedFile;", "", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "modified", "", "getModified", "()J", "compareTo", "", "another", "equals", "", "", "hashCode", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ModifiedFile implements Comparable<ModifiedFile> {
        public static final Companion Companion = new Companion(null);
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private final File file;
        private final long modified;

        public ModifiedFile(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
            this.modified = file.lastModified();
        }

        public final File getFile() {
            return this.file;
        }

        public final long getModified() {
            return this.modified;
        }

        @Override // java.lang.Comparable
        public int compareTo(ModifiedFile another) {
            Intrinsics.checkNotNullParameter(another, "another");
            long j = this.modified;
            long j2 = another.modified;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.file.compareTo(another.file);
        }

        public boolean equals(Object obj) {
            return (obj instanceof ModifiedFile) && compareTo((ModifiedFile) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.file.hashCode()) * 37) + ((int) (this.modified % Integer.MAX_VALUE));
        }

        /* compiled from: FileLruCache.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/FileLruCache$ModifiedFile$Companion;", "", "()V", "HASH_MULTIPLIER", "", "HASH_SEED", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: FileLruCache.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/FileLruCache$Companion;", "", "()V", "HEADER_CACHEKEY_KEY", "", "HEADER_CACHE_CONTENT_TAG_KEY", "TAG", "getTAG", "()Ljava/lang/String;", "bufferIndex", "Ljava/util/concurrent/atomic/AtomicLong;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getTAG() {
            return FileLruCache.TAG;
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("FileLruCache", "FileLruCache::class.java.simpleName");
        TAG = "FileLruCache";
        bufferIndex = new AtomicLong();
    }
}
