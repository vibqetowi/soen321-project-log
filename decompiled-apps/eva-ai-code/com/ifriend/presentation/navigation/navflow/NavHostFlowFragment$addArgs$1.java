package com.ifriend.presentation.navigation.navflow;

import android.os.Bundle;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavHostFlowFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavArgumentBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavHostFlowFragment$addArgs$1 extends Lambda implements Function1<NavArgumentBuilder, Unit> {
    final /* synthetic */ Bundle $args;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostFlowFragment$addArgs$1(Bundle bundle) {
        super(1);
        this.$args = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavArgumentBuilder navArgumentBuilder) {
        invoke2(navArgumentBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NavArgumentBuilder argument) {
        Intrinsics.checkNotNullParameter(argument, "$this$argument");
        argument.setType(NavType.StringType);
        String string = this.$args.getString(NavHostFlowFragment.CHAT_CALL_ARG_KEY);
        if (string == null) {
            string = "";
        }
        argument.setDefaultValue(string);
    }
}
