package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileMenuContentKt$ProfileMenuItem$$inlined$ConstraintLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ Function4 $indicator$inlined;
    final /* synthetic */ Function0 $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ String $text$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMenuContentKt$ProfileMenuItem$$inlined$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, int i, Function0 function0, String str, int i2, Function4 function4) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = function0;
        this.$text$inlined = str;
        this.$$dirty$inlined = i2;
        this.$indicator$inlined = function4;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if (((i & 11) ^ 2) != 0 || !composer.getSkipping()) {
            int helpersHashCode = this.$scope.getHelpersHashCode();
            this.$scope.reset();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            int i2 = ((this.$$changed >> 3) & 112) | 8;
            ConstrainedLayoutReference createRef = constraintLayoutScope.createRef();
            ProfileMenuContentKt.ProfileMenuItemText(this.$text$inlined, constraintLayoutScope.constrainAs(Modifier.Companion, createRef, ProfileMenuContentKt$ProfileMenuItem$1$1.INSTANCE), composer, this.$$dirty$inlined & 14);
            composer.startReplaceableGroup(-136483524);
            Function4 function4 = this.$indicator$inlined;
            if (function4 != null) {
                function4.invoke(constraintLayoutScope, createRef, composer, Integer.valueOf((i2 & 14) | ConstraintLayoutScope.$stable | (this.$$dirty$inlined & 896)));
            }
            composer.endReplaceableGroup();
            if (this.$scope.getHelpersHashCode() != helpersHashCode) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
