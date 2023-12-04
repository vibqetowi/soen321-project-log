package com.ifriend.chat.presentation.ui.menu.botProfile.reset;

import android.content.Context;
import com.ifriend.chat.presentation.R;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialog;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialogButton;
import com.ifriend.ui.base.dialog.bottomDialog.BottomDialogButtonType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResetFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.reset.ResetFragment$openMenu$1$1", f = "ResetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ResetFragment$openMenu$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $onPositiveClickListener;
    final /* synthetic */ String $positiveText;
    int label;
    final /* synthetic */ ResetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetFragment$openMenu$1$1(ResetFragment resetFragment, Context context, String str, Function0<Unit> function0, Continuation<? super ResetFragment$openMenu$1$1> continuation) {
        super(2, continuation);
        this.this$0 = resetFragment;
        this.$context = context;
        this.$positiveText = str;
        this.$onPositiveClickListener = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetFragment$openMenu$1$1(this.this$0, this.$context, this.$positiveText, this.$onPositiveClickListener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetFragment$openMenu$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Bot bot = this.this$0.getViewModel().currentState().getBot();
        String str = (bot == null || (str = bot.getName()) == null) ? "" : "";
        ResetFragment resetFragment = this.this$0;
        Context context = this.$context;
        Intrinsics.checkNotNullExpressionValue(context, "$context");
        BottomDialog bottomDialog = new BottomDialog(context);
        ResetFragment resetFragment2 = this.this$0;
        String str2 = this.$positiveText;
        Function0<Unit> function0 = this.$onPositiveClickListener;
        String string = resetFragment2.getString(R.string.are_you_sure_you_want_to_reset, str);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        bottomDialog.init(string, CollectionsKt.listOf(new BottomDialogButton(str2, BottomDialogButtonType.Default.INSTANCE, function0)));
        bottomDialog.setCanceledOnTouchOutside(true);
        bottomDialog.show();
        resetFragment.bottomDialog = bottomDialog;
        return Unit.INSTANCE;
    }
}
