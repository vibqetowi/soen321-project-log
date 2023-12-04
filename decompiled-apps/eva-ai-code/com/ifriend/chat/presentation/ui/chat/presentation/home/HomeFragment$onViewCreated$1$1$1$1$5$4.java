package com.ifriend.chat.presentation.ui.chat.presentation.home;

import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: HomeFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class HomeFragment$onViewCreated$1$1$1$1$5$4 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public HomeFragment$onViewCreated$1$1$1$1$5$4(Object obj) {
        super(0, obj, HomeViewModel.class, "onAddNeuronsClick", "onAddNeuronsClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HomeViewModel) this.receiver).onAddNeuronsClick();
    }
}
