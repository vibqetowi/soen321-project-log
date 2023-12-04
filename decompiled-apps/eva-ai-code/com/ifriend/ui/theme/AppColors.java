package com.ifriend.ui.theme;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AppColors.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b;\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NB\u0090\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0002\u0010\u0015R4\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR4\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR4\u0010\n\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR4\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR4\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b(\u0010\u001c\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR+\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00148F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b\u0013\u0010)\"\u0004\b*\u0010+R4\u0010\t\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR4\u0010\f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001c\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR4\u0010\r\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001c\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR4\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b8\u0010\u001c\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001aR4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b;\u0010\u001c\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR4\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b>\u0010\u001c\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001aR4\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bA\u0010\u001c\u001a\u0004\b?\u0010\u0018\"\u0004\b@\u0010\u001aR4\u0010\b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bD\u0010\u001c\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u0010\u001aR4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bG\u0010\u001c\u001a\u0004\bE\u0010\u0018\"\u0004\bF\u0010\u001aR4\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u001c\u001a\u0004\bH\u0010\u0018\"\u0004\bI\u0010\u001aR4\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bM\u0010\u001c\u001a\u0004\bK\u0010\u0018\"\u0004\bL\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Lcom/ifriend/ui/theme/AppColors;", "", "textPrimary", "Landroidx/compose/ui/graphics/Color;", "textSecondary", "iconPrimary", "background", "surface", "surfaceVariant", "light", "dark", "light5", "light10", "light20", "light25", "primary", "error", "warning", "accent", "isLight", "", "(JJJJJJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "getAccent-0d7_KjU", "()J", "setAccent-8_81llA$common_ui_release", "(J)V", "accent$delegate", "Landroidx/compose/runtime/MutableState;", "getBackground-0d7_KjU", "setBackground-8_81llA", "background$delegate", "getDark-0d7_KjU", "setDark-8_81llA$common_ui_release", "dark$delegate", "getError-0d7_KjU", "setError-8_81llA$common_ui_release", "error$delegate", "getIconPrimary-0d7_KjU", "setIconPrimary-8_81llA", "iconPrimary$delegate", "()Z", "setLight$common_ui_release", "(Z)V", "isLight$delegate", "getLight-0d7_KjU", "setLight-8_81llA$common_ui_release", "light$delegate", "getLight10-0d7_KjU", "setLight10-8_81llA$common_ui_release", "light10$delegate", "getLight20-0d7_KjU", "setLight20-8_81llA$common_ui_release", "light20$delegate", "getLight25-0d7_KjU", "setLight25-8_81llA$common_ui_release", "light25$delegate", "getLight5-0d7_KjU", "setLight5-8_81llA$common_ui_release", "light5$delegate", "getPrimary-0d7_KjU", "setPrimary-8_81llA$common_ui_release", "primary$delegate", "getSurface-0d7_KjU", "setSurface-8_81llA", "surface$delegate", "getSurfaceVariant-0d7_KjU", "setSurfaceVariant-8_81llA", "surfaceVariant$delegate", "getTextPrimary-0d7_KjU", "setTextPrimary-8_81llA", "textPrimary$delegate", "getTextSecondary-0d7_KjU", "setTextSecondary-8_81llA", "textSecondary$delegate", "getWarning-0d7_KjU", "setWarning-8_81llA$common_ui_release", "warning$delegate", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppColors {
    public static final int $stable = 0;
    private final MutableState accent$delegate;
    private final MutableState background$delegate;
    private final MutableState dark$delegate;
    private final MutableState error$delegate;
    private final MutableState iconPrimary$delegate;
    private final MutableState isLight$delegate;
    private final MutableState light$delegate;
    private final MutableState light10$delegate;
    private final MutableState light20$delegate;
    private final MutableState light25$delegate;
    private final MutableState light5$delegate;
    private final MutableState primary$delegate;
    private final MutableState surface$delegate;
    private final MutableState surfaceVariant$delegate;
    private final MutableState textPrimary$delegate;
    private final MutableState textSecondary$delegate;
    private final MutableState warning$delegate;
    public static final Companion Companion = new Companion(null);
    private static final long Violet = ColorKt.Color(4287067135L);
    private static final long VioletDark = ColorKt.Color(4283972863L);
    private static final long VioletLight = ColorKt.Color(4286998514L);
    private static final long AppVioletGradient = ColorKt.Color(4286276095L);
    private static final long Red = ColorKt.Color(4293825198L);
    private static final Brush BackgroundColorGradient = Brush.Companion.m3242linearGradientmHitzGk$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(Color.Companion.m3317getBlack0d7_KjU()), Color.m3281boximpl(ColorKt.Color(4278916644L))}), 0, 0, 0, 14, (Object) null);
    private static final long NotificationGreenColor = ColorKt.Color(4287233873L);
    private static final long NotificationWhiteShadowColor = ColorKt.Color(4293914610L);
    private static final long RedIndicatorColor = ColorKt.Color(4294914387L);
    private static final long TranslucentCardColor = ColorKt.Color(990053125);
    private static final long PinkBadgeColor = ColorKt.Color(1506756337);
    private static final long OrangeBadgeColor = ColorKt.Color(1509002822);
    private static final long GreenBadgeColor = ColorKt.Color(1497956104);

    public /* synthetic */ AppColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, z);
    }

    private AppColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m3281boximpl(j), null, 2, null);
        this.textPrimary$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m3281boximpl(j2), null, 2, null);
        this.textSecondary$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m3281boximpl(j3), null, 2, null);
        this.iconPrimary$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m3281boximpl(j4), null, 2, null);
        this.background$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m3281boximpl(j5), null, 2, null);
        this.surface$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m3281boximpl(j6), null, 2, null);
        this.surfaceVariant$delegate = mutableStateOf$default6;
        this.light$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.light5$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.light10$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.light20$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.light25$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.dark$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.warning$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.accent$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.isLight$delegate = mutableStateOf$default7;
    }

    /* compiled from: AppColors.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\rR'\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R'\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R'\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R'\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0007R'\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007R'\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007R'\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0007R'\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0007R'\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0007R'\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0007R'\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Lcom/ifriend/ui/theme/AppColors$Companion;", "", "()V", "AppVioletGradient", "Landroidx/compose/ui/graphics/Color;", "getAppVioletGradient-0d7_KjU$annotations", "getAppVioletGradient-0d7_KjU", "()J", "J", "BackgroundColorGradient", "Landroidx/compose/ui/graphics/Brush;", "getBackgroundColorGradient$annotations", "getBackgroundColorGradient", "()Landroidx/compose/ui/graphics/Brush;", "GreenBadgeColor", "getGreenBadgeColor-0d7_KjU$annotations", "getGreenBadgeColor-0d7_KjU", "NotificationGreenColor", "getNotificationGreenColor-0d7_KjU$annotations", "getNotificationGreenColor-0d7_KjU", "NotificationWhiteShadowColor", "getNotificationWhiteShadowColor-0d7_KjU$annotations", "getNotificationWhiteShadowColor-0d7_KjU", "OrangeBadgeColor", "getOrangeBadgeColor-0d7_KjU$annotations", "getOrangeBadgeColor-0d7_KjU", "PinkBadgeColor", "getPinkBadgeColor-0d7_KjU$annotations", "getPinkBadgeColor-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "RedIndicatorColor", "getRedIndicatorColor-0d7_KjU$annotations", "getRedIndicatorColor-0d7_KjU", "TranslucentCardColor", "getTranslucentCardColor-0d7_KjU$annotations", "getTranslucentCardColor-0d7_KjU", "Violet", "getViolet-0d7_KjU$annotations", "getViolet-0d7_KjU", "VioletDark", "getVioletDark-0d7_KjU$annotations", "getVioletDark-0d7_KjU", "VioletLight", "getVioletLight-0d7_KjU$annotations", "getVioletLight-0d7_KjU", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAppVioletGradient-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7121getAppVioletGradient0d7_KjU$annotations() {
        }

        public static /* synthetic */ void getBackgroundColorGradient$annotations() {
        }

        /* renamed from: getGreenBadgeColor-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7122getGreenBadgeColor0d7_KjU$annotations() {
        }

        /* renamed from: getNotificationGreenColor-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7123getNotificationGreenColor0d7_KjU$annotations() {
        }

        /* renamed from: getNotificationWhiteShadowColor-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7124getNotificationWhiteShadowColor0d7_KjU$annotations() {
        }

        /* renamed from: getOrangeBadgeColor-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7125getOrangeBadgeColor0d7_KjU$annotations() {
        }

        /* renamed from: getPinkBadgeColor-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7126getPinkBadgeColor0d7_KjU$annotations() {
        }

        /* renamed from: getRed-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7127getRed0d7_KjU$annotations() {
        }

        /* renamed from: getRedIndicatorColor-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7128getRedIndicatorColor0d7_KjU$annotations() {
        }

        /* renamed from: getTranslucentCardColor-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7129getTranslucentCardColor0d7_KjU$annotations() {
        }

        /* renamed from: getViolet-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7130getViolet0d7_KjU$annotations() {
        }

        /* renamed from: getVioletDark-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7131getVioletDark0d7_KjU$annotations() {
        }

        /* renamed from: getVioletLight-0d7_KjU$annotations  reason: not valid java name */
        public static /* synthetic */ void m7132getVioletLight0d7_KjU$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getViolet-0d7_KjU  reason: not valid java name */
        public final long m7142getViolet0d7_KjU() {
            return AppColors.Violet;
        }

        /* renamed from: getVioletDark-0d7_KjU  reason: not valid java name */
        public final long m7143getVioletDark0d7_KjU() {
            return AppColors.VioletDark;
        }

        /* renamed from: getVioletLight-0d7_KjU  reason: not valid java name */
        public final long m7144getVioletLight0d7_KjU() {
            return AppColors.VioletLight;
        }

        /* renamed from: getAppVioletGradient-0d7_KjU  reason: not valid java name */
        public final long m7133getAppVioletGradient0d7_KjU() {
            return AppColors.AppVioletGradient;
        }

        /* renamed from: getRed-0d7_KjU  reason: not valid java name */
        public final long m7139getRed0d7_KjU() {
            return AppColors.Red;
        }

        public final Brush getBackgroundColorGradient() {
            return AppColors.BackgroundColorGradient;
        }

        /* renamed from: getNotificationGreenColor-0d7_KjU  reason: not valid java name */
        public final long m7135getNotificationGreenColor0d7_KjU() {
            return AppColors.NotificationGreenColor;
        }

        /* renamed from: getNotificationWhiteShadowColor-0d7_KjU  reason: not valid java name */
        public final long m7136getNotificationWhiteShadowColor0d7_KjU() {
            return AppColors.NotificationWhiteShadowColor;
        }

        /* renamed from: getRedIndicatorColor-0d7_KjU  reason: not valid java name */
        public final long m7140getRedIndicatorColor0d7_KjU() {
            return AppColors.RedIndicatorColor;
        }

        /* renamed from: getTranslucentCardColor-0d7_KjU  reason: not valid java name */
        public final long m7141getTranslucentCardColor0d7_KjU() {
            return AppColors.TranslucentCardColor;
        }

        /* renamed from: getPinkBadgeColor-0d7_KjU  reason: not valid java name */
        public final long m7138getPinkBadgeColor0d7_KjU() {
            return AppColors.PinkBadgeColor;
        }

        /* renamed from: getOrangeBadgeColor-0d7_KjU  reason: not valid java name */
        public final long m7137getOrangeBadgeColor0d7_KjU() {
            return AppColors.OrangeBadgeColor;
        }

        /* renamed from: getGreenBadgeColor-0d7_KjU  reason: not valid java name */
        public final long m7134getGreenBadgeColor0d7_KjU() {
            return AppColors.GreenBadgeColor;
        }
    }

    /* renamed from: setTextPrimary-8_81llA  reason: not valid java name */
    private final void m7093setTextPrimary8_81llA(long j) {
        this.textPrimary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getTextPrimary-0d7_KjU  reason: not valid java name */
    public final long m7108getTextPrimary0d7_KjU() {
        return ((Color) this.textPrimary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setTextSecondary-8_81llA  reason: not valid java name */
    private final void m7094setTextSecondary8_81llA(long j) {
        this.textSecondary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getTextSecondary-0d7_KjU  reason: not valid java name */
    public final long m7109getTextSecondary0d7_KjU() {
        return ((Color) this.textSecondary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setIconPrimary-8_81llA  reason: not valid java name */
    private final void m7090setIconPrimary8_81llA(long j) {
        this.iconPrimary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getIconPrimary-0d7_KjU  reason: not valid java name */
    public final long m7099getIconPrimary0d7_KjU() {
        return ((Color) this.iconPrimary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setBackground-8_81llA  reason: not valid java name */
    private final void m7089setBackground8_81llA(long j) {
        this.background$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m7096getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSurface-8_81llA  reason: not valid java name */
    private final void m7091setSurface8_81llA(long j) {
        this.surface$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m7106getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSurfaceVariant-8_81llA  reason: not valid java name */
    private final void m7092setSurfaceVariant8_81llA(long j) {
        this.surfaceVariant$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m7107getSurfaceVariant0d7_KjU() {
        return ((Color) this.surfaceVariant$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: getLight-0d7_KjU  reason: not valid java name */
    public final long m7100getLight0d7_KjU() {
        return ((Color) this.light$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setLight-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7114setLight8_81llA$common_ui_release(long j) {
        this.light$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getLight5-0d7_KjU  reason: not valid java name */
    public final long m7104getLight50d7_KjU() {
        return ((Color) this.light5$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setLight5-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7118setLight58_81llA$common_ui_release(long j) {
        this.light5$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getLight10-0d7_KjU  reason: not valid java name */
    public final long m7101getLight100d7_KjU() {
        return ((Color) this.light10$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setLight10-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7115setLight108_81llA$common_ui_release(long j) {
        this.light10$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getLight20-0d7_KjU  reason: not valid java name */
    public final long m7102getLight200d7_KjU() {
        return ((Color) this.light20$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setLight20-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7116setLight208_81llA$common_ui_release(long j) {
        this.light20$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getLight25-0d7_KjU  reason: not valid java name */
    public final long m7103getLight250d7_KjU() {
        return ((Color) this.light25$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setLight25-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7117setLight258_81llA$common_ui_release(long j) {
        this.light25$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getDark-0d7_KjU  reason: not valid java name */
    public final long m7097getDark0d7_KjU() {
        return ((Color) this.dark$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setDark-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7112setDark8_81llA$common_ui_release(long j) {
        this.dark$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m7105getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setPrimary-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7119setPrimary8_81llA$common_ui_release(long j) {
        this.primary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m7098getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setError-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7113setError8_81llA$common_ui_release(long j) {
        this.error$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getWarning-0d7_KjU  reason: not valid java name */
    public final long m7110getWarning0d7_KjU() {
        return ((Color) this.warning$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setWarning-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7120setWarning8_81llA$common_ui_release(long j) {
        this.warning$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getAccent-0d7_KjU  reason: not valid java name */
    public final long m7095getAccent0d7_KjU() {
        return ((Color) this.accent$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setAccent-8_81llA$common_ui_release  reason: not valid java name */
    public final void m7111setAccent8_81llA$common_ui_release(long j) {
        this.accent$delegate.setValue(Color.m3281boximpl(j));
    }

    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    public final void setLight$common_ui_release(boolean z) {
        this.isLight$delegate.setValue(Boolean.valueOf(z));
    }
}
