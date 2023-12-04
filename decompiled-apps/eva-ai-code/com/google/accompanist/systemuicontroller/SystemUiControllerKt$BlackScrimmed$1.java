package com.google.accompanist.systemuicontroller;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: SystemUiController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "original", "invoke-l2rxGTc", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SystemUiControllerKt$BlackScrimmed$1 extends Lambda implements Function1<Color, Color> {
    public static final SystemUiControllerKt$BlackScrimmed$1 INSTANCE = new SystemUiControllerKt$BlackScrimmed$1();

    SystemUiControllerKt$BlackScrimmed$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Color invoke(Color color) {
        return Color.m3281boximpl(m6468invokel2rxGTc(color.m3301unboximpl()));
    }

    /* renamed from: invoke-l2rxGTc  reason: not valid java name */
    public final long m6468invokel2rxGTc(long j) {
        long j2;
        j2 = SystemUiControllerKt.BlackScrim;
        return ColorKt.m3336compositeOverOWjLjI(j2, j);
    }
}
