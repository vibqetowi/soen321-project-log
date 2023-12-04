package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018\u001au\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001aS\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001b\u001a\u007f\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a]\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u001d"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/CardColors;", "elevation", "Landroidx/compose/material3/CardElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedCard", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedCard", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CardKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Card(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        CardColors cardColors2;
        Object obj;
        Object obj2;
        int i4;
        Modifier.Companion companion;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation2;
        Object obj3;
        int i5;
        CardElevation cardElevation3;
        BorderStroke borderStroke2;
        CardElevation cardElevation4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1179621553);
        ComposerKt.sourceInformation(startRestartGroup, "C(Card)P(4,5,1,3)77@3629L5,78@3674L12,79@3732L15,86@3923L30,87@3991L28,88@4062L56,89@4162L57,83@3839L460:Card.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                shape2 = shape;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                cardColors2 = cardColors;
                if (startRestartGroup.changed(cardColors2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                cardColors2 = cardColors;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            cardColors2 = cardColors;
        }
        if ((i & 7168) == 0) {
            obj = cardElevation;
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(obj)) ? 2048 : 1024;
        } else {
            obj = cardElevation;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
            obj2 = borderStroke;
        } else {
            obj2 = borderStroke;
            if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) == 0) {
            if ((458752 & i) == 0) {
                i4 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
            }
            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i8 == 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 2) == 0) {
                        shape3 = CardDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        i3 &= -113;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 4) == 0) {
                        cardColors3 = CardDefaults.INSTANCE.m1607cardColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                        i3 &= -897;
                    } else {
                        cardColors3 = cardColors2;
                    }
                    if ((i2 & 8) == 0) {
                        cardElevation2 = CardDefaults.INSTANCE.m1608cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        cardElevation2 = cardElevation;
                    }
                    obj3 = i9 == 0 ? null : borderStroke;
                    CardElevation cardElevation5 = cardElevation2;
                    i5 = i3;
                    cardElevation3 = cardElevation5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    companion = modifier2;
                    shape3 = shape2;
                    cardColors3 = cardColors2;
                    obj3 = obj2;
                    i5 = i3;
                    cardElevation3 = obj;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1179621553, i5, -1, "androidx.compose.material3.Card (Card.kt:75)");
                }
                int i10 = i5 >> 3;
                int i11 = (i10 & 112) | 6;
                int i12 = (i10 & 896) | 54;
                CardElevation cardElevation6 = cardElevation3;
                SurfaceKt.m2067SurfaceT9BRK9s(companion, shape3, cardColors3.containerColor$material3_release(true, startRestartGroup, i11).getValue().m3301unboximpl(), cardColors3.contentColor$material3_release(true, startRestartGroup, i11).getValue().m3301unboximpl(), cardElevation3.tonalElevation$material3_release(true, null, startRestartGroup, i12).getValue().m5621unboximpl(), cardElevation3.shadowElevation$material3_release(true, null, startRestartGroup, i12).getValue().m5621unboximpl(), obj3, ComposableLambdaKt.composableLambda(startRestartGroup, 664103990, true, new CardKt$Card$1(content, i5)), startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | ((i5 << 6) & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cardColors2 = cardColors3;
                borderStroke2 = obj3;
                cardElevation4 = cardElevation6;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                shape3 = shape2;
                borderStroke2 = obj2;
                cardElevation4 = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new CardKt$Card$2(companion, shape3, cardColors2, cardElevation4, borderStroke2, content, i, i2));
            return;
        }
        i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i3 |= i4;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if (i9 == 0) {
        }
        CardElevation cardElevation52 = cardElevation2;
        i5 = i3;
        cardElevation3 = cardElevation52;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i102 = i5 >> 3;
        int i112 = (i102 & 112) | 6;
        int i122 = (i102 & 896) | 54;
        CardElevation cardElevation62 = cardElevation3;
        SurfaceKt.m2067SurfaceT9BRK9s(companion, shape3, cardColors3.containerColor$material3_release(true, startRestartGroup, i112).getValue().m3301unboximpl(), cardColors3.contentColor$material3_release(true, startRestartGroup, i112).getValue().m3301unboximpl(), cardElevation3.tonalElevation$material3_release(true, null, startRestartGroup, i122).getValue().m5621unboximpl(), cardElevation3.shadowElevation$material3_release(true, null, startRestartGroup, i122).getValue().m5621unboximpl(), obj3, ComposableLambdaKt.composableLambda(startRestartGroup, 664103990, true, new CardKt$Card$1(content, i5)), startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | ((i5 << 6) & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        cardColors2 = cardColors3;
        borderStroke2 = obj3;
        cardElevation4 = cardElevation62;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Card(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        Shape shape2;
        CardColors cardColors2;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        int i7;
        char c;
        Shape shape3;
        int i8;
        boolean z3;
        CardColors cardColors3;
        CardElevation cardElevation2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        int i9;
        Shape shape4;
        BorderStroke borderStroke2;
        CardColors cardColors4;
        boolean z4;
        CardElevation cardElevation3;
        Composer composer2;
        Modifier modifier3;
        Shape shape5;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        CardColors cardColors5;
        CardElevation cardElevation4;
        boolean z5;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2024281376);
        ComposerKt.sourceInformation(startRestartGroup, "C(Card)P(7,6,4,8,1,3!1,5)135@6366L5,136@6411L12,137@6469L15,139@6570L39,147@6805L23,148@6866L21,149@6930L42,150@7016L43,142@6667L519:Card.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i12 = 2048;
                            i3 |= i12;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i12 = 1024;
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        cardColors2 = cardColors;
                        if (startRestartGroup.changed(cardColors2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        cardColors2 = cardColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    cardColors2 = cardColors;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        obj = cardElevation;
                        if (startRestartGroup.changed(obj)) {
                            i10 = 131072;
                            i3 |= i10;
                        }
                    } else {
                        obj = cardElevation;
                    }
                    i10 = 65536;
                    i3 |= i10;
                } else {
                    obj = cardElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    obj2 = borderStroke;
                } else {
                    obj2 = borderStroke;
                    if ((3670016 & i) == 0) {
                        i3 |= startRestartGroup.changed(obj2) ? 1048576 : 524288;
                    }
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    if ((i & 234881024) == 0) {
                        i7 = startRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i13 == 0 ? Modifier.Companion : modifier;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) == 0) {
                                c = 6;
                                shape3 = CardDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                i3 &= -7169;
                            } else {
                                c = 6;
                                shape3 = shape2;
                            }
                            if ((i2 & 16) == 0) {
                                i8 = i6;
                                z3 = true;
                                cardColors3 = CardDefaults.INSTANCE.m1607cardColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                i3 &= -57345;
                            } else {
                                i8 = i6;
                                z3 = true;
                                cardColors3 = cardColors2;
                            }
                            if ((i2 & 32) == 0) {
                                cardElevation2 = CardDefaults.INSTANCE.m1608cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                i3 &= -458753;
                            } else {
                                cardElevation2 = obj;
                            }
                            BorderStroke borderStroke4 = i5 == 0 ? null : borderStroke;
                            if (i8 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                modifier2 = companion;
                                i9 = i3;
                                shape4 = shape3;
                                borderStroke2 = borderStroke4;
                                cardColors4 = cardColors3;
                                z4 = z2;
                                cardElevation3 = cardElevation2;
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                modifier2 = companion;
                                i9 = i3;
                                shape4 = shape3;
                                borderStroke2 = borderStroke4;
                                cardColors4 = cardColors3;
                                z4 = z2;
                                cardElevation3 = cardElevation2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i9 = i3;
                            z4 = z2;
                            shape4 = shape2;
                            cardColors4 = cardColors2;
                            z3 = true;
                            cardElevation3 = obj;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2024281376, i9, -1, "androidx.compose.material3.Card (Card.kt:131)");
                        }
                        int i14 = (i9 >> 6) & 14;
                        int i15 = i9 >> 9;
                        int i16 = i14 | (i15 & 112);
                        long m3301unboximpl = cardColors4.containerColor$material3_release(z4, startRestartGroup, i16).getValue().m3301unboximpl();
                        long m3301unboximpl2 = cardColors4.contentColor$material3_release(z4, startRestartGroup, i16).getValue().m3301unboximpl();
                        CardColors cardColors6 = cardColors4;
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        int i17 = i14 | ((i9 >> 18) & 112) | (i15 & 896);
                        int i18 = i9 << 6;
                        CardElevation cardElevation5 = cardElevation3;
                        boolean z6 = z4;
                        composer2 = startRestartGroup;
                        SurfaceKt.m2070Surfaceo_FOJdg(onClick, modifier2, z6, shape4, m3301unboximpl, m3301unboximpl2, cardElevation3.tonalElevation$material3_release(z4, mutableInteractionSource4, startRestartGroup, i17).getValue().m5621unboximpl(), cardElevation3.shadowElevation$material3_release(z4, mutableInteractionSource4, startRestartGroup, i17).getValue().m5621unboximpl(), borderStroke2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 776921067, z3, new CardKt$Card$4(content, i9)), composer2, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i18 & 234881024) | (i18 & 1879048192), 6, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        shape5 = shape4;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        cardColors5 = cardColors6;
                        cardElevation4 = cardElevation5;
                        z5 = z6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        z5 = z2;
                        shape5 = shape2;
                        cardColors5 = cardColors2;
                        cardElevation4 = obj;
                        borderStroke3 = obj2;
                        modifier3 = modifier;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new CardKt$Card$5(onClick, modifier3, z5, shape5, cardColors5, cardElevation4, borderStroke3, mutableInteractionSource3, content, i, i2));
                    return;
                }
                i7 = 100663296;
                i3 |= i7;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i5 == 0) {
                }
                if (i8 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i142 = (i9 >> 6) & 14;
                int i152 = i9 >> 9;
                int i162 = i142 | (i152 & 112);
                long m3301unboximpl3 = cardColors4.containerColor$material3_release(z4, startRestartGroup, i162).getValue().m3301unboximpl();
                long m3301unboximpl22 = cardColors4.contentColor$material3_release(z4, startRestartGroup, i162).getValue().m3301unboximpl();
                CardColors cardColors62 = cardColors4;
                MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                int i172 = i142 | ((i9 >> 18) & 112) | (i152 & 896);
                int i182 = i9 << 6;
                CardElevation cardElevation52 = cardElevation3;
                boolean z62 = z4;
                composer2 = startRestartGroup;
                SurfaceKt.m2070Surfaceo_FOJdg(onClick, modifier2, z62, shape4, m3301unboximpl3, m3301unboximpl22, cardElevation3.tonalElevation$material3_release(z4, mutableInteractionSource42, startRestartGroup, i172).getValue().m5621unboximpl(), cardElevation3.shadowElevation$material3_release(z4, mutableInteractionSource42, startRestartGroup, i172).getValue().m5621unboximpl(), borderStroke2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 776921067, z3, new CardKt$Card$4(content, i9)), composer2, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i182 & 234881024) | (i182 & 1879048192), 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                shape5 = shape4;
                borderStroke3 = borderStroke2;
                mutableInteractionSource3 = mutableInteractionSource2;
                cardColors5 = cardColors62;
                cardElevation4 = cardElevation52;
                z5 = z62;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i7;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i5 == 0) {
            }
            if (i8 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1422 = (i9 >> 6) & 14;
            int i1522 = i9 >> 9;
            int i1622 = i1422 | (i1522 & 112);
            long m3301unboximpl32 = cardColors4.containerColor$material3_release(z4, startRestartGroup, i1622).getValue().m3301unboximpl();
            long m3301unboximpl222 = cardColors4.contentColor$material3_release(z4, startRestartGroup, i1622).getValue().m3301unboximpl();
            CardColors cardColors622 = cardColors4;
            MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            int i1722 = i1422 | ((i9 >> 18) & 112) | (i1522 & 896);
            int i1822 = i9 << 6;
            CardElevation cardElevation522 = cardElevation3;
            boolean z622 = z4;
            composer2 = startRestartGroup;
            SurfaceKt.m2070Surfaceo_FOJdg(onClick, modifier2, z622, shape4, m3301unboximpl32, m3301unboximpl222, cardElevation3.tonalElevation$material3_release(z4, mutableInteractionSource422, startRestartGroup, i1722).getValue().m5621unboximpl(), cardElevation3.shadowElevation$material3_release(z4, mutableInteractionSource422, startRestartGroup, i1722).getValue().m5621unboximpl(), borderStroke2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 776921067, z3, new CardKt$Card$4(content, i9)), composer2, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i1822 & 234881024) | (i1822 & 1879048192), 6, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            shape5 = shape4;
            borderStroke3 = borderStroke2;
            mutableInteractionSource3 = mutableInteractionSource2;
            cardColors5 = cardColors622;
            cardElevation4 = cardElevation522;
            z5 = z622;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i7;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i5 == 0) {
        }
        if (i8 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i14222 = (i9 >> 6) & 14;
        int i15222 = i9 >> 9;
        int i16222 = i14222 | (i15222 & 112);
        long m3301unboximpl322 = cardColors4.containerColor$material3_release(z4, startRestartGroup, i16222).getValue().m3301unboximpl();
        long m3301unboximpl2222 = cardColors4.contentColor$material3_release(z4, startRestartGroup, i16222).getValue().m3301unboximpl();
        CardColors cardColors6222 = cardColors4;
        MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        int i17222 = i14222 | ((i9 >> 18) & 112) | (i15222 & 896);
        int i18222 = i9 << 6;
        CardElevation cardElevation5222 = cardElevation3;
        boolean z6222 = z4;
        composer2 = startRestartGroup;
        SurfaceKt.m2070Surfaceo_FOJdg(onClick, modifier2, z6222, shape4, m3301unboximpl322, m3301unboximpl2222, cardElevation3.tonalElevation$material3_release(z4, mutableInteractionSource4222, startRestartGroup, i17222).getValue().m5621unboximpl(), cardElevation3.shadowElevation$material3_release(z4, mutableInteractionSource4222, startRestartGroup, i17222).getValue().m5621unboximpl(), borderStroke2, mutableInteractionSource2, ComposableLambdaKt.composableLambda(startRestartGroup, 776921067, z3, new CardKt$Card$4(content, i9)), composer2, (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i18222 & 234881024) | (i18222 & 1879048192), 6, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        shape5 = shape4;
        borderStroke3 = borderStroke2;
        mutableInteractionSource3 = mutableInteractionSource2;
        cardColors5 = cardColors6222;
        cardElevation4 = cardElevation5222;
        z5 = z6222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        Object obj2;
        Object obj3;
        Object obj4;
        Shape shape2;
        CardColors cardColors2;
        Object obj5;
        Object obj6;
        Object obj7;
        CardElevation m1610elevatedCardElevationaqJV_2Y;
        Composer composer2;
        Modifier modifier2;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation2;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(895940201);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedCard)P(3,4!1,2)185@8633L13,186@8686L20,187@8752L23,189@8829L140:Card.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                obj2 = shape;
                if (startRestartGroup.changed(obj2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                obj2 = shape;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            obj2 = shape;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                obj3 = cardColors;
                if (startRestartGroup.changed(obj3)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                obj3 = cardColors;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            obj3 = cardColors;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                obj4 = cardElevation;
                if (startRestartGroup.changed(obj4)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                obj4 = cardElevation;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            obj4 = cardElevation;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        if ((46811 & i3) != 9362 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i7 != 0 ? Modifier.Companion : obj;
                if ((i2 & 2) != 0) {
                    shape2 = CardDefaults.INSTANCE.getElevatedShape(startRestartGroup, 6);
                    i3 &= -113;
                } else {
                    shape2 = obj2;
                }
                if ((i2 & 4) != 0) {
                    cardColors2 = CardDefaults.INSTANCE.m1609elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                    i3 &= -897;
                } else {
                    cardColors2 = obj3;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    obj5 = companion;
                    obj6 = shape2;
                    obj7 = cardColors2;
                    m1610elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m1610elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(895940201, i3, -1, "androidx.compose.material3.ElevatedCard (Card.kt:183)");
                    }
                    composer2 = startRestartGroup;
                    Card(obj5, obj6, obj7, m1610elevatedCardElevationaqJV_2Y, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 << 3) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = obj5;
                    shape3 = obj6;
                    cardColors3 = obj7;
                    cardElevation2 = m1610elevatedCardElevationaqJV_2Y;
                } else {
                    obj5 = companion;
                    obj6 = shape2;
                    obj7 = cardColors2;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                obj5 = obj;
                obj6 = obj2;
                obj7 = obj3;
            }
            m1610elevatedCardElevationaqJV_2Y = obj4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            Card(obj5, obj6, obj7, m1610elevatedCardElevationaqJV_2Y, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 << 3) & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj5;
            shape3 = obj6;
            cardColors3 = obj7;
            cardElevation2 = m1610elevatedCardElevationaqJV_2Y;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = obj;
            shape3 = obj2;
            cardColors3 = obj3;
            cardElevation2 = obj4;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CardKt$ElevatedCard$1(modifier2, shape3, cardColors3, cardElevation2, content, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedCard(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z2;
        Object obj2;
        Object obj3;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        boolean z3;
        Shape shape2;
        int i7;
        CardColors cardColors2;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Composer composer2;
        Modifier modifier2;
        CardColors cardColors3;
        CardElevation cardElevation2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z4;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1850977784);
        ComposerKt.sourceInformation(startRestartGroup, "C(ElevatedCard)P(6,5,3,7!1,2,4)234@10976L13,235@11029L20,236@11095L23,237@11170L39,239@11263L229:Card.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        obj2 = shape;
                        if (startRestartGroup.changed(obj2)) {
                            i10 = 2048;
                            i3 |= i10;
                        }
                    } else {
                        obj2 = shape;
                    }
                    i10 = 1024;
                    i3 |= i10;
                } else {
                    obj2 = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        obj3 = cardColors;
                        if (startRestartGroup.changed(obj3)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        obj3 = cardColors;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    obj3 = cardColors;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        obj4 = cardElevation;
                        if (startRestartGroup.changed(obj4)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        obj4 = cardElevation;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    obj4 = cardElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    obj5 = mutableInteractionSource;
                } else {
                    obj5 = mutableInteractionSource;
                    if ((3670016 & i) == 0) {
                        i3 |= startRestartGroup.changed(obj5) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) == 0) {
                    if ((i & 29360128) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                    }
                    if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i11 == 0 ? Modifier.Companion : obj;
                            z3 = i4 == 0 ? true : z2;
                            if ((i2 & 8) == 0) {
                                i3 &= -7169;
                                shape2 = CardDefaults.INSTANCE.getElevatedShape(startRestartGroup, 6);
                            } else {
                                shape2 = obj2;
                            }
                            if ((i2 & 16) == 0) {
                                i7 = i3 & (-57345);
                                cardColors2 = CardDefaults.INSTANCE.m1609elevatedCardColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                            } else {
                                i7 = i3;
                                cardColors2 = obj3;
                            }
                            if ((i2 & 32) == 0) {
                                obj4 = CardDefaults.INSTANCE.m1610elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                i3 = i7 & (-458753);
                            } else {
                                i3 = i7;
                            }
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                obj6 = (MutableInteractionSource) rememberedValue;
                            } else {
                                obj6 = mutableInteractionSource;
                            }
                            obj7 = obj4;
                            obj8 = cardColors2;
                            obj9 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            obj9 = obj;
                            z3 = z2;
                            shape2 = obj2;
                            obj8 = obj3;
                            obj7 = obj4;
                            obj6 = obj5;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1850977784, i3, -1, "androidx.compose.material3.ElevatedCard (Card.kt:230)");
                        }
                        int i12 = i3 << 3;
                        composer2 = startRestartGroup;
                        Card(onClick, obj9, z3, shape2, obj8, obj7, null, obj6, content, startRestartGroup, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i12 & 29360128) | (i12 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = obj9;
                        cardColors3 = obj8;
                        cardElevation2 = obj7;
                        mutableInteractionSource2 = obj6;
                        z4 = z3;
                        shape3 = shape2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        z4 = z2;
                        shape3 = obj2;
                        cardColors3 = obj3;
                        cardElevation2 = obj4;
                        mutableInteractionSource2 = obj5;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new CardKt$ElevatedCard$3(onClick, modifier2, z4, shape3, cardColors3, cardElevation2, mutableInteractionSource2, content, i, i2));
                    return;
                }
                i6 = 12582912;
                i3 |= i6;
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i5 == 0) {
                }
                obj7 = obj4;
                obj8 = cardColors2;
                obj9 = companion;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i122 = i3 << 3;
                composer2 = startRestartGroup;
                Card(onClick, obj9, z3, shape2, obj8, obj7, null, obj6, content, startRestartGroup, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i122 & 29360128) | (i122 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = obj9;
                cardColors3 = obj8;
                cardElevation2 = obj7;
                mutableInteractionSource2 = obj6;
                z4 = z3;
                shape3 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i3 |= i6;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i5 == 0) {
            }
            obj7 = obj4;
            obj8 = cardColors2;
            obj9 = companion;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1222 = i3 << 3;
            composer2 = startRestartGroup;
            Card(onClick, obj9, z3, shape2, obj8, obj7, null, obj6, content, startRestartGroup, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i1222 & 29360128) | (i1222 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = obj9;
            cardColors3 = obj8;
            cardElevation2 = obj7;
            mutableInteractionSource2 = obj6;
            z4 = z3;
            shape3 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i3 |= i6;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i5 == 0) {
        }
        obj7 = obj4;
        obj8 = cardColors2;
        obj9 = companion;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i12222 = i3 << 3;
        composer2 = startRestartGroup;
        Card(onClick, obj9, z3, shape2, obj8, obj7, null, obj6, content, startRestartGroup, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i12222 & 29360128) | (i12222 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj9;
        cardColors3 = obj8;
        cardElevation2 = obj7;
        mutableInteractionSource2 = obj6;
        z4 = z3;
        shape3 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i4;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Composer composer2;
        Modifier modifier2;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(740336179);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedCard)P(4,5,1,3)279@13027L13,280@13080L20,281@13146L23,282@13211L20,284@13285L142:Card.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                obj2 = shape;
                if (startRestartGroup.changed(obj2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                obj2 = shape;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            obj2 = shape;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                obj3 = cardColors;
                if (startRestartGroup.changed(obj3)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                obj3 = cardColors;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            obj3 = cardColors;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                obj4 = cardElevation;
                if (startRestartGroup.changed(obj4)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                obj4 = cardElevation;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            obj4 = cardElevation;
        }
        if ((i & 57344) == 0) {
            obj5 = borderStroke;
            i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(obj5)) ? 16384 : 8192;
        } else {
            obj5 = borderStroke;
        }
        if ((i2 & 32) == 0) {
            if ((i & 458752) == 0) {
                i4 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
            }
            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i8 == 0 ? Modifier.Companion : obj;
                    if ((i2 & 2) == 0) {
                        shape2 = CardDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                        i3 &= -113;
                    } else {
                        shape2 = obj2;
                    }
                    if ((i2 & 4) == 0) {
                        cardColors2 = CardDefaults.INSTANCE.m1611outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                        i3 &= -897;
                    } else {
                        cardColors2 = obj3;
                    }
                    if ((i2 & 8) == 0) {
                        cardElevation2 = CardDefaults.INSTANCE.m1612outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        cardElevation2 = obj4;
                    }
                    if ((i2 & 16) == 0) {
                        i3 &= -57345;
                        obj7 = companion;
                        obj8 = shape2;
                        obj9 = cardColors2;
                        obj10 = cardElevation2;
                        obj6 = CardDefaults.INSTANCE.outlinedCardBorder(false, startRestartGroup, 48, 1);
                    } else {
                        obj6 = borderStroke;
                        obj7 = companion;
                        obj8 = shape2;
                        obj9 = cardColors2;
                        obj10 = cardElevation2;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    obj7 = obj;
                    obj8 = obj2;
                    obj9 = obj3;
                    obj6 = obj5;
                    obj10 = obj4;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(740336179, i3, -1, "androidx.compose.material3.OutlinedCard (Card.kt:277)");
                }
                composer2 = startRestartGroup;
                Card(obj7, obj8, obj9, obj10, obj6, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = obj7;
                shape3 = obj8;
                cardColors3 = obj9;
                cardElevation3 = obj10;
                borderStroke2 = obj6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
                shape3 = obj2;
                cardColors3 = obj3;
                cardElevation3 = obj4;
                composer2 = startRestartGroup;
                borderStroke2 = obj5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new CardKt$OutlinedCard$1(modifier2, shape3, cardColors3, cardElevation3, borderStroke2, content, i, i2));
            return;
        }
        i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i3 |= i4;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        Card(obj7, obj8, obj9, obj10, obj6, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = obj7;
        shape3 = obj8;
        cardColors3 = obj9;
        cardElevation3 = obj10;
        borderStroke2 = obj6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedCard(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i5;
        int i6;
        Shape shape2;
        int i7;
        CardColors cardColors2;
        boolean z3;
        int i8;
        boolean z4;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        Object obj5;
        Object obj6;
        Object obj7;
        Modifier modifier2;
        boolean z5;
        Composer composer2;
        Modifier modifier3;
        boolean z6;
        CardColors cardColors3;
        CardElevation cardElevation2;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-727137250);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedCard)P(7,6,4,8,1,3!1,5)330@15524L13,331@15577L20,332@15643L23,333@15708L27,334@15787L39,336@15880L231:Card.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        obj = shape;
                        if (startRestartGroup.changed(obj)) {
                            i11 = 2048;
                            i3 |= i11;
                        }
                    } else {
                        obj = shape;
                    }
                    i11 = 1024;
                    i3 |= i11;
                } else {
                    obj = shape;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        obj2 = cardColors;
                        if (startRestartGroup.changed(obj2)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        obj2 = cardColors;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    obj2 = cardColors;
                }
                if ((i & 458752) == 0) {
                    if ((i2 & 32) == 0) {
                        obj3 = cardElevation;
                        if (startRestartGroup.changed(obj3)) {
                            i9 = 131072;
                            i3 |= i9;
                        }
                    } else {
                        obj3 = cardElevation;
                    }
                    i9 = 65536;
                    i3 |= i9;
                } else {
                    obj3 = cardElevation;
                }
                if ((i & 3670016) == 0) {
                    obj4 = borderStroke;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(obj4)) ? 1048576 : 524288;
                } else {
                    obj4 = borderStroke;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    if ((i & 234881024) == 0) {
                        i6 = startRestartGroup.changedInstance(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i12 == 0 ? Modifier.Companion : modifier;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) == 0) {
                                i3 &= -7169;
                                shape2 = CardDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                            } else {
                                shape2 = obj;
                            }
                            if ((i2 & 16) == 0) {
                                i7 = i3 & (-57345);
                                cardColors2 = CardDefaults.INSTANCE.m1611outlinedCardColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                            } else {
                                i7 = i3;
                                cardColors2 = obj2;
                            }
                            if ((i2 & 32) == 0) {
                                z3 = z2;
                                i8 = i5;
                                i7 &= -458753;
                                obj3 = CardDefaults.INSTANCE.m1612outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                            } else {
                                z3 = z2;
                                i8 = i5;
                            }
                            if ((i2 & 64) == 0) {
                                z4 = z3;
                                borderStroke2 = CardDefaults.INSTANCE.outlinedCardBorder(z4, startRestartGroup, ((i7 >> 6) & 14) | 48, 0);
                                i7 &= -3670017;
                            } else {
                                z4 = z3;
                                borderStroke2 = borderStroke;
                            }
                            if (i8 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                obj5 = borderStroke2;
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                obj5 = borderStroke2;
                            }
                            obj6 = obj3;
                            obj7 = cardColors2;
                            i3 = i7;
                            modifier2 = companion;
                            z5 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z5 = z2;
                            shape2 = obj;
                            obj7 = obj2;
                            obj6 = obj3;
                            obj5 = obj4;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-727137250, i3, -1, "androidx.compose.material3.OutlinedCard (Card.kt:326)");
                        }
                        composer2 = startRestartGroup;
                        Card(onClick, modifier2, z5, shape2, obj7, obj6, obj5, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        z6 = z5;
                        cardColors3 = obj7;
                        cardElevation2 = obj6;
                        borderStroke3 = obj5;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape3 = shape2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        z6 = z2;
                        shape3 = obj;
                        cardColors3 = obj2;
                        cardElevation2 = obj3;
                        borderStroke3 = obj4;
                        composer2 = startRestartGroup;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new CardKt$OutlinedCard$3(onClick, modifier3, z6, shape3, cardColors3, cardElevation2, borderStroke3, mutableInteractionSource3, content, i, i2));
                    return;
                }
                i6 = 100663296;
                i3 |= i6;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i8 == 0) {
                }
                obj6 = obj3;
                obj7 = cardColors2;
                i3 = i7;
                modifier2 = companion;
                z5 = z4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                Card(onClick, modifier2, z5, shape2, obj7, obj6, obj5, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z6 = z5;
                cardColors3 = obj7;
                cardElevation2 = obj6;
                borderStroke3 = obj5;
                mutableInteractionSource3 = mutableInteractionSource2;
                shape3 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i & 458752) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i6;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i8 == 0) {
            }
            obj6 = obj3;
            obj7 = cardColors2;
            i3 = i7;
            modifier2 = companion;
            z5 = z4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            Card(onClick, modifier2, z5, shape2, obj7, obj6, obj5, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z6 = z5;
            cardColors3 = obj7;
            cardElevation2 = obj6;
            borderStroke3 = obj5;
            mutableInteractionSource3 = mutableInteractionSource2;
            shape3 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i & 458752) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i6;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i8 == 0) {
        }
        obj6 = obj3;
        obj7 = cardColors2;
        i3 = i7;
        modifier2 = companion;
        z5 = z4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        Card(onClick, modifier2, z5, shape2, obj7, obj6, obj5, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z6 = z5;
        cardColors3 = obj7;
        cardElevation2 = obj6;
        borderStroke3 = obj5;
        mutableInteractionSource3 = mutableInteractionSource2;
        shape3 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
