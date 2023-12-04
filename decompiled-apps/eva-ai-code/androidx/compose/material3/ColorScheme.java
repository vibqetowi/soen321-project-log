package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ColorScheme.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b|\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bð\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010 Jµ\u0002\u0010|\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\t\u0010\u007f\u001a\u00030\u0080\u0001H\u0016R4\u0010\u0010\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R4\u0010\u0019\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b*\u0010'\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R4\u0010\u001b\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R4\u0010\u0018\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b0\u0010'\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R4\u0010\u0007\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b3\u0010'\u001a\u0004\b1\u0010#\"\u0004\b2\u0010%R4\u0010\u0017\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b6\u0010'\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R4\u0010\u0011\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b9\u0010'\u001a\u0004\b7\u0010#\"\u0004\b8\u0010%R4\u0010\u001a\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b<\u0010'\u001a\u0004\b:\u0010#\"\u0004\b;\u0010%R4\u0010\u001c\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b?\u0010'\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%R4\u0010\u0004\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bB\u0010'\u001a\u0004\b@\u0010#\"\u0004\bA\u0010%R4\u0010\u0006\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bE\u0010'\u001a\u0004\bC\u0010#\"\u0004\bD\u0010%R4\u0010\t\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bH\u0010'\u001a\u0004\bF\u0010#\"\u0004\bG\u0010%R4\u0010\u000b\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bK\u0010'\u001a\u0004\bI\u0010#\"\u0004\bJ\u0010%R4\u0010\u0013\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bN\u0010'\u001a\u0004\bL\u0010#\"\u0004\bM\u0010%R4\u0010\u0015\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bQ\u0010'\u001a\u0004\bO\u0010#\"\u0004\bP\u0010%R4\u0010\r\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bT\u0010'\u001a\u0004\bR\u0010#\"\u0004\bS\u0010%R4\u0010\u000f\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bW\u0010'\u001a\u0004\bU\u0010#\"\u0004\bV\u0010%R4\u0010\u001d\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bZ\u0010'\u001a\u0004\bX\u0010#\"\u0004\bY\u0010%R4\u0010\u001e\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b]\u0010'\u001a\u0004\b[\u0010#\"\u0004\b\\\u0010%R4\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b`\u0010'\u001a\u0004\b^\u0010#\"\u0004\b_\u0010%R4\u0010\u0005\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bc\u0010'\u001a\u0004\ba\u0010#\"\u0004\bb\u0010%R4\u0010\u001f\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bf\u0010'\u001a\u0004\bd\u0010#\"\u0004\be\u0010%R4\u0010\b\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bi\u0010'\u001a\u0004\bg\u0010#\"\u0004\bh\u0010%R4\u0010\n\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bl\u0010'\u001a\u0004\bj\u0010#\"\u0004\bk\u0010%R4\u0010\u0012\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bo\u0010'\u001a\u0004\bm\u0010#\"\u0004\bn\u0010%R4\u0010\u0016\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\br\u0010'\u001a\u0004\bp\u0010#\"\u0004\bq\u0010%R4\u0010\u0014\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bu\u0010'\u001a\u0004\bs\u0010#\"\u0004\bt\u0010%R4\u0010\f\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bx\u0010'\u001a\u0004\bv\u0010#\"\u0004\bw\u0010%R4\u0010\u000e\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b{\u0010'\u001a\u0004\by\u0010#\"\u0004\bz\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "primary", "Landroidx/compose/ui/graphics/Color;", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "getBackground-0d7_KjU", "()J", "setBackground-8_81llA$material3_release", "(J)V", "background$delegate", "Landroidx/compose/runtime/MutableState;", "getError-0d7_KjU", "setError-8_81llA$material3_release", "error$delegate", "getErrorContainer-0d7_KjU", "setErrorContainer-8_81llA$material3_release", "errorContainer$delegate", "getInverseOnSurface-0d7_KjU", "setInverseOnSurface-8_81llA$material3_release", "inverseOnSurface$delegate", "getInversePrimary-0d7_KjU", "setInversePrimary-8_81llA$material3_release", "inversePrimary$delegate", "getInverseSurface-0d7_KjU", "setInverseSurface-8_81llA$material3_release", "inverseSurface$delegate", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material3_release", "onBackground$delegate", "getOnError-0d7_KjU", "setOnError-8_81llA$material3_release", "onError$delegate", "getOnErrorContainer-0d7_KjU", "setOnErrorContainer-8_81llA$material3_release", "onErrorContainer$delegate", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material3_release", "onPrimary$delegate", "getOnPrimaryContainer-0d7_KjU", "setOnPrimaryContainer-8_81llA$material3_release", "onPrimaryContainer$delegate", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material3_release", "onSecondary$delegate", "getOnSecondaryContainer-0d7_KjU", "setOnSecondaryContainer-8_81llA$material3_release", "onSecondaryContainer$delegate", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material3_release", "onSurface$delegate", "getOnSurfaceVariant-0d7_KjU", "setOnSurfaceVariant-8_81llA$material3_release", "onSurfaceVariant$delegate", "getOnTertiary-0d7_KjU", "setOnTertiary-8_81llA$material3_release", "onTertiary$delegate", "getOnTertiaryContainer-0d7_KjU", "setOnTertiaryContainer-8_81llA$material3_release", "onTertiaryContainer$delegate", "getOutline-0d7_KjU", "setOutline-8_81llA$material3_release", "outline$delegate", "getOutlineVariant-0d7_KjU", "setOutlineVariant-8_81llA$material3_release", "outlineVariant$delegate", "getPrimary-0d7_KjU", "setPrimary-8_81llA$material3_release", "primary$delegate", "getPrimaryContainer-0d7_KjU", "setPrimaryContainer-8_81llA$material3_release", "primaryContainer$delegate", "getScrim-0d7_KjU", "setScrim-8_81llA$material3_release", "scrim$delegate", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material3_release", "secondary$delegate", "getSecondaryContainer-0d7_KjU", "setSecondaryContainer-8_81llA$material3_release", "secondaryContainer$delegate", "getSurface-0d7_KjU", "setSurface-8_81llA$material3_release", "surface$delegate", "getSurfaceTint-0d7_KjU", "setSurfaceTint-8_81llA$material3_release", "surfaceTint$delegate", "getSurfaceVariant-0d7_KjU", "setSurfaceVariant-8_81llA$material3_release", "surfaceVariant$delegate", "getTertiary-0d7_KjU", "setTertiary-8_81llA$material3_release", "tertiary$delegate", "getTertiaryContainer-0d7_KjU", "setTertiaryContainer-8_81llA$material3_release", "tertiaryContainer$delegate", "copy", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorScheme {
    public static final int $stable = 0;
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState errorContainer$delegate;
    private final MutableState inverseOnSurface$delegate;
    private final MutableState inversePrimary$delegate;
    private final MutableState inverseSurface$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onErrorContainer$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onPrimaryContainer$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSecondaryContainer$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState onSurfaceVariant$delegate;
    private final MutableState onTertiary$delegate;
    private final MutableState onTertiaryContainer$delegate;
    private final MutableState outline$delegate;
    private final MutableState outlineVariant$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryContainer$delegate;
    private final MutableState scrim$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryContainer$delegate;
    private final MutableState surface$delegate;
    private final MutableState surfaceTint$delegate;
    private final MutableState surfaceVariant$delegate;
    private final MutableState tertiary$delegate;
    private final MutableState tertiaryContainer$delegate;

    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
    }

    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.inversePrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiary$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurfaceVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceTint$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j20), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j21), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseOnSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j22), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j23), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j24), SnapshotStateKt.structuralEqualityPolicy());
        this.errorContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j25), SnapshotStateKt.structuralEqualityPolicy());
        this.onErrorContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j26), SnapshotStateKt.structuralEqualityPolicy());
        this.outline$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j27), SnapshotStateKt.structuralEqualityPolicy());
        this.outlineVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j28), SnapshotStateKt.structuralEqualityPolicy());
        this.scrim$delegate = SnapshotStateKt.mutableStateOf(Color.m3281boximpl(j29), SnapshotStateKt.structuralEqualityPolicy());
    }

    /* renamed from: getPrimary-0d7_KjU  reason: not valid java name */
    public final long m1646getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setPrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m1675setPrimary8_81llA$material3_release(long j) {
        this.primary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnPrimary-0d7_KjU  reason: not valid java name */
    public final long m1636getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnPrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m1665setOnPrimary8_81llA$material3_release(long j) {
        this.onPrimary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1647getPrimaryContainer0d7_KjU() {
        return ((Color) this.primaryContainer$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setPrimaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1676setPrimaryContainer8_81llA$material3_release(long j) {
        this.primaryContainer$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1637getOnPrimaryContainer0d7_KjU() {
        return ((Color) this.onPrimaryContainer$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnPrimaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1666setOnPrimaryContainer8_81llA$material3_release(long j) {
        this.onPrimaryContainer$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getInversePrimary-0d7_KjU  reason: not valid java name */
    public final long m1631getInversePrimary0d7_KjU() {
        return ((Color) this.inversePrimary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setInversePrimary-8_81llA$material3_release  reason: not valid java name */
    public final void m1660setInversePrimary8_81llA$material3_release(long j) {
        this.inversePrimary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSecondary-0d7_KjU  reason: not valid java name */
    public final long m1649getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSecondary-8_81llA$material3_release  reason: not valid java name */
    public final void m1678setSecondary8_81llA$material3_release(long j) {
        this.secondary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnSecondary-0d7_KjU  reason: not valid java name */
    public final long m1638getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnSecondary-8_81llA$material3_release  reason: not valid java name */
    public final void m1667setOnSecondary8_81llA$material3_release(long j) {
        this.onSecondary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1650getSecondaryContainer0d7_KjU() {
        return ((Color) this.secondaryContainer$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSecondaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1679setSecondaryContainer8_81llA$material3_release(long j) {
        this.secondaryContainer$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1639getOnSecondaryContainer0d7_KjU() {
        return ((Color) this.onSecondaryContainer$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnSecondaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1668setOnSecondaryContainer8_81llA$material3_release(long j) {
        this.onSecondaryContainer$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getTertiary-0d7_KjU  reason: not valid java name */
    public final long m1654getTertiary0d7_KjU() {
        return ((Color) this.tertiary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setTertiary-8_81llA$material3_release  reason: not valid java name */
    public final void m1683setTertiary8_81llA$material3_release(long j) {
        this.tertiary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnTertiary-0d7_KjU  reason: not valid java name */
    public final long m1642getOnTertiary0d7_KjU() {
        return ((Color) this.onTertiary$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnTertiary-8_81llA$material3_release  reason: not valid java name */
    public final void m1671setOnTertiary8_81llA$material3_release(long j) {
        this.onTertiary$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1655getTertiaryContainer0d7_KjU() {
        return ((Color) this.tertiaryContainer$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setTertiaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1684setTertiaryContainer8_81llA$material3_release(long j) {
        this.tertiaryContainer$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU  reason: not valid java name */
    public final long m1643getOnTertiaryContainer0d7_KjU() {
        return ((Color) this.onTertiaryContainer$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnTertiaryContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1672setOnTertiaryContainer8_81llA$material3_release(long j) {
        this.onTertiaryContainer$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m1627getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setBackground-8_81llA$material3_release  reason: not valid java name */
    public final void m1656setBackground8_81llA$material3_release(long j) {
        this.background$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnBackground-0d7_KjU  reason: not valid java name */
    public final long m1633getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnBackground-8_81llA$material3_release  reason: not valid java name */
    public final void m1662setOnBackground8_81llA$material3_release(long j) {
        this.onBackground$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSurface-0d7_KjU  reason: not valid java name */
    public final long m1651getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m1680setSurface8_81llA$material3_release(long j) {
        this.surface$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnSurface-0d7_KjU  reason: not valid java name */
    public final long m1640getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m1669setOnSurface8_81llA$material3_release(long j) {
        this.onSurface$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m1653getSurfaceVariant0d7_KjU() {
        return ((Color) this.surfaceVariant$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSurfaceVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m1682setSurfaceVariant8_81llA$material3_release(long j) {
        this.surfaceVariant$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU  reason: not valid java name */
    public final long m1641getOnSurfaceVariant0d7_KjU() {
        return ((Color) this.onSurfaceVariant$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnSurfaceVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m1670setOnSurfaceVariant8_81llA$material3_release(long j) {
        this.onSurfaceVariant$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getSurfaceTint-0d7_KjU  reason: not valid java name */
    public final long m1652getSurfaceTint0d7_KjU() {
        return ((Color) this.surfaceTint$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setSurfaceTint-8_81llA$material3_release  reason: not valid java name */
    public final void m1681setSurfaceTint8_81llA$material3_release(long j) {
        this.surfaceTint$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getInverseSurface-0d7_KjU  reason: not valid java name */
    public final long m1632getInverseSurface0d7_KjU() {
        return ((Color) this.inverseSurface$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setInverseSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m1661setInverseSurface8_81llA$material3_release(long j) {
        this.inverseSurface$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getInverseOnSurface-0d7_KjU  reason: not valid java name */
    public final long m1630getInverseOnSurface0d7_KjU() {
        return ((Color) this.inverseOnSurface$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setInverseOnSurface-8_81llA$material3_release  reason: not valid java name */
    public final void m1659setInverseOnSurface8_81llA$material3_release(long j) {
        this.inverseOnSurface$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getError-0d7_KjU  reason: not valid java name */
    public final long m1628getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setError-8_81llA$material3_release  reason: not valid java name */
    public final void m1657setError8_81llA$material3_release(long j) {
        this.error$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnError-0d7_KjU  reason: not valid java name */
    public final long m1634getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnError-8_81llA$material3_release  reason: not valid java name */
    public final void m1663setOnError8_81llA$material3_release(long j) {
        this.onError$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m1629getErrorContainer0d7_KjU() {
        return ((Color) this.errorContainer$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setErrorContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1658setErrorContainer8_81llA$material3_release(long j) {
        this.errorContainer$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOnErrorContainer-0d7_KjU  reason: not valid java name */
    public final long m1635getOnErrorContainer0d7_KjU() {
        return ((Color) this.onErrorContainer$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOnErrorContainer-8_81llA$material3_release  reason: not valid java name */
    public final void m1664setOnErrorContainer8_81llA$material3_release(long j) {
        this.onErrorContainer$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOutline-0d7_KjU  reason: not valid java name */
    public final long m1644getOutline0d7_KjU() {
        return ((Color) this.outline$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOutline-8_81llA$material3_release  reason: not valid java name */
    public final void m1673setOutline8_81llA$material3_release(long j) {
        this.outline$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getOutlineVariant-0d7_KjU  reason: not valid java name */
    public final long m1645getOutlineVariant0d7_KjU() {
        return ((Color) this.outlineVariant$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setOutlineVariant-8_81llA$material3_release  reason: not valid java name */
    public final void m1674setOutlineVariant8_81llA$material3_release(long j) {
        this.outlineVariant$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: getScrim-0d7_KjU  reason: not valid java name */
    public final long m1648getScrim0d7_KjU() {
        return ((Color) this.scrim$delegate.getValue()).m3301unboximpl();
    }

    /* renamed from: setScrim-8_81llA$material3_release  reason: not valid java name */
    public final void m1677setScrim8_81llA$material3_release(long j) {
        this.scrim$delegate.setValue(Color.m3281boximpl(j));
    }

    /* renamed from: copy-G1PFc-w  reason: not valid java name */
    public final ColorScheme m1626copyG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, null);
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.m3299toStringimpl(m1646getPrimary0d7_KjU())) + "onPrimary=" + ((Object) Color.m3299toStringimpl(m1636getOnPrimary0d7_KjU())) + "primaryContainer=" + ((Object) Color.m3299toStringimpl(m1647getPrimaryContainer0d7_KjU())) + "onPrimaryContainer=" + ((Object) Color.m3299toStringimpl(m1637getOnPrimaryContainer0d7_KjU())) + "inversePrimary=" + ((Object) Color.m3299toStringimpl(m1631getInversePrimary0d7_KjU())) + "secondary=" + ((Object) Color.m3299toStringimpl(m1649getSecondary0d7_KjU())) + "onSecondary=" + ((Object) Color.m3299toStringimpl(m1638getOnSecondary0d7_KjU())) + "secondaryContainer=" + ((Object) Color.m3299toStringimpl(m1650getSecondaryContainer0d7_KjU())) + "onSecondaryContainer=" + ((Object) Color.m3299toStringimpl(m1639getOnSecondaryContainer0d7_KjU())) + "tertiary=" + ((Object) Color.m3299toStringimpl(m1654getTertiary0d7_KjU())) + "onTertiary=" + ((Object) Color.m3299toStringimpl(m1642getOnTertiary0d7_KjU())) + "tertiaryContainer=" + ((Object) Color.m3299toStringimpl(m1655getTertiaryContainer0d7_KjU())) + "onTertiaryContainer=" + ((Object) Color.m3299toStringimpl(m1643getOnTertiaryContainer0d7_KjU())) + "background=" + ((Object) Color.m3299toStringimpl(m1627getBackground0d7_KjU())) + "onBackground=" + ((Object) Color.m3299toStringimpl(m1633getOnBackground0d7_KjU())) + "surface=" + ((Object) Color.m3299toStringimpl(m1651getSurface0d7_KjU())) + "onSurface=" + ((Object) Color.m3299toStringimpl(m1640getOnSurface0d7_KjU())) + "surfaceVariant=" + ((Object) Color.m3299toStringimpl(m1653getSurfaceVariant0d7_KjU())) + "onSurfaceVariant=" + ((Object) Color.m3299toStringimpl(m1641getOnSurfaceVariant0d7_KjU())) + "surfaceTint=" + ((Object) Color.m3299toStringimpl(m1652getSurfaceTint0d7_KjU())) + "inverseSurface=" + ((Object) Color.m3299toStringimpl(m1632getInverseSurface0d7_KjU())) + "inverseOnSurface=" + ((Object) Color.m3299toStringimpl(m1630getInverseOnSurface0d7_KjU())) + "error=" + ((Object) Color.m3299toStringimpl(m1628getError0d7_KjU())) + "onError=" + ((Object) Color.m3299toStringimpl(m1634getOnError0d7_KjU())) + "errorContainer=" + ((Object) Color.m3299toStringimpl(m1629getErrorContainer0d7_KjU())) + "onErrorContainer=" + ((Object) Color.m3299toStringimpl(m1635getOnErrorContainer0d7_KjU())) + "outline=" + ((Object) Color.m3299toStringimpl(m1644getOutline0d7_KjU())) + "outlineVariant=" + ((Object) Color.m3299toStringimpl(m1645getOutlineVariant0d7_KjU())) + "scrim=" + ((Object) Color.m3299toStringimpl(m1648getScrim0d7_KjU())) + ')';
    }
}
