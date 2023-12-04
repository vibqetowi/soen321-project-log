package com.ifriend.chat.presentation.ui.chat.photo;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.errorsHandling.notifications.UnableToSendImage;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendMessageEvent;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.ui.utils.UIUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreviewSendImageViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.chat.photo.PreviewSendImageViewModel$send$1", f = "PreviewSendImageViewModel.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class PreviewSendImageViewModel$send$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ PreviewSendImageViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSendImageViewModel$send$1(PreviewSendImageViewModel previewSendImageViewModel, Context context, String str, Continuation<? super PreviewSendImageViewModel$send$1> continuation) {
        super(2, continuation);
        this.this$0 = previewSendImageViewModel;
        this.$context = context;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreviewSendImageViewModel$send$1(this.this$0, this.$context, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PreviewSendImageViewModel$send$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InternalNotificationHandler internalNotificationHandler;
        Logger logger;
        Bitmap resize$default;
        ChatClientInteractor chatClientInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Bitmap image = this.this$0.currentState().getImage();
                if (image != null && (resize$default = UIUtils.resize$default(UIUtils.INSTANCE, image, 0, 1, null)) != null) {
                    File cacheDir = this.$context.getCacheDir();
                    long currentTimeMillis = System.currentTimeMillis();
                    File file = new File(cacheDir, "image_" + currentTimeMillis);
                    file.createNewFile();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    resize$default.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    chatClientInteractor = this.this$0.chatClientInteractor;
                    this.label = 1;
                    if (chatClientInteractor.handleEvent(this.$chatId, new SendMessageEvent(new MessageToSend.Image(file, this.$chatId)), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            internalNotificationHandler = this.this$0.internalNotificationHandler;
            internalNotificationHandler.handle(UnableToSendImage.INSTANCE);
            logger = this.this$0.logger;
            logger.logException(e);
        }
        return Unit.INSTANCE;
    }
}
