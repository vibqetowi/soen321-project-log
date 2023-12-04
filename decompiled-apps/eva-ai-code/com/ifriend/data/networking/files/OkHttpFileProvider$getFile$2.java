package com.ifriend.data.networking.files;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.files.OkHttpFileProvider;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Response;
/* compiled from: OkHttpFileProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.networking.files.OkHttpFileProvider$getFile$2", f = "OkHttpFileProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class OkHttpFileProvider$getFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ OkHttpFileProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpFileProvider$getFile$2(OkHttpFileProvider okHttpFileProvider, String str, Continuation<? super OkHttpFileProvider$getFile$2> continuation) {
        super(2, continuation);
        this.this$0 = okHttpFileProvider;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkHttpFileProvider$getFile$2(this.this$0, this.$url, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((OkHttpFileProvider$getFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String fileNameFromUrl;
        File localStorageDirectory;
        Logger logger;
        Response downloadFile;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            fileNameFromUrl = this.this$0.getFileNameFromUrl(this.$url);
            localStorageDirectory = this.this$0.getLocalStorageDirectory();
            File file = new File(localStorageDirectory, fileNameFromUrl);
            if (!file.exists()) {
                try {
                    downloadFile = this.this$0.downloadFile(this.$url);
                    this.this$0.saveFile(downloadFile, file);
                } catch (IOException e) {
                    logger = this.this$0.logger;
                    IOException iOException = e;
                    logger.logException(iOException);
                    throw new OkHttpFileProvider.FileDownloadException("Insufficient storage space", iOException);
                }
            }
            return file;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
