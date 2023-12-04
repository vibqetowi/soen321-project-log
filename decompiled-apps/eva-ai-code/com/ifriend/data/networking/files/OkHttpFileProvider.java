package com.ifriend.data.networking.files;

import android.content.Context;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.files.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: OkHttpFileProvider.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/ifriend/data/networking/files/OkHttpFileProvider;", "Lcom/ifriend/domain/data/files/FileProvider;", "context", "Landroid/content/Context;", "okHttpClient", "Lokhttp3/OkHttpClient;", "logger", "Lcom/ifriend/common_utils/Logger;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/domain/CoroutineDispatchers;)V", "downloadFile", "Lokhttp3/Response;", "url", "", "getFile", "Ljava/io/File;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileNameFromUrl", "getLocalStorageDirectory", "saveFile", "", "response", ShareInternalUtility.STAGING_PARAM, "FileDownloadException", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OkHttpFileProvider implements FileProvider {
    private final Context context;
    private final CoroutineDispatchers dispatchers;
    private final Logger logger;
    private final OkHttpClient okHttpClient;

    public OkHttpFileProvider(Context context, OkHttpClient okHttpClient, Logger logger, CoroutineDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.context = context;
        this.okHttpClient = okHttpClient;
        this.logger = logger;
        this.dispatchers = dispatchers;
    }

    @Override // com.ifriend.domain.data.files.FileProvider
    public Object getFile(String str, Continuation<? super File> continuation) {
        return BuildersKt.withContext(this.dispatchers.getIO(), new OkHttpFileProvider$getFile$2(this, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFileNameFromUrl(String str) {
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, '/', 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1 || lastIndexOf$default >= str.length() - 1) {
            return "downloaded_file";
        }
        String substring = str.substring(lastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getLocalStorageDirectory() {
        return new File(this.context.getFilesDir(), "downloaded_files");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Response downloadFile(String str) {
        return FirebasePerfOkHttpClient.execute(this.okHttpClient.newCall(new Request.Builder().url(str).build()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFile(Response response, File file) {
        try {
            try {
                ResponseBody body = response.body();
                InputStream byteStream = body != null ? body.byteStream() : null;
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (byteStream != null) {
                    InputStream inputStream = byteStream;
                    try {
                        InputStream inputStream2 = inputStream;
                        FileOutputStream fileOutputStream2 = fileOutputStream;
                        FileOutputStream fileOutputStream3 = fileOutputStream2;
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = inputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream3.write(bArr, 0, read);
                        }
                        fileOutputStream3.flush();
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileOutputStream2, null);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(inputStream, null);
                    } finally {
                    }
                }
            } catch (IOException e) {
                this.logger.logException(e);
                throw new FileDownloadException("Error saving file", e);
            }
        } finally {
            response.close();
        }
    }

    /* compiled from: OkHttpFileProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/data/networking/files/OkHttpFileProvider$FileDownloadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class FileDownloadException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileDownloadException(String message, Throwable cause) {
            super(message, cause);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }
}
