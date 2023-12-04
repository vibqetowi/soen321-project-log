package com.ifriend.ui.utils;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UIHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UIHelper$hideKeyboardIfOpened$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Function0<Unit> $doAfter;
    final /* synthetic */ Job $job;
    final /* synthetic */ View $rootView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIHelper$hideKeyboardIfOpened$1(Job job, View view, Function0<Unit> function0) {
        super(1);
        this.$job = job;
        this.$rootView = view;
        this.$doAfter = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        Job.DefaultImpls.cancel$default(this.$job, (CancellationException) null, 1, (Object) null);
        UIHelper.hideKeyboardIfOpened$invokeDoAfter(this.$rootView, this.$doAfter);
    }
}
