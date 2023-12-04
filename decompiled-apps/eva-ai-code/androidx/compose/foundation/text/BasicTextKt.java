package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.internal.ViewUtils;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010 \u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010!\u001a\u001e\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002\u001a¯\u0001\u0010'\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)2\u0014\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0018\u00010+2\u001c\u0010.\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010/0+\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "textModifier", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "textModifier-RWo7tUw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:189:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* renamed from: BasicText-VhcvRP8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1018BasicTextVhcvRP8(String text, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, ColorProducer colorProducer, Composer composer, int i4, int i5) {
        int i6;
        int i7;
        Object obj;
        int i8;
        Object obj2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier.Companion companion;
        TextStyle textStyle2;
        Object obj3;
        boolean z2;
        int i15;
        int i16;
        ColorProducer colorProducer2;
        SelectionRegistrar selectionRegistrar;
        SelectionController selectionController;
        int i17;
        int i18;
        Modifier m1019textModifierRWo7tUw;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        int i19;
        boolean z3;
        ColorProducer colorProducer3;
        Modifier modifier2;
        TextStyle textStyle3;
        Function1<? super TextLayoutResult, Unit> function12;
        int i20;
        int i21;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1186827822);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)94@4599L7,138@6175L41:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i22 = i5 & 2;
        if (i22 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                obj = textStyle;
                i6 |= startRestartGroup.changed(obj) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i4 & 7168) == 0) {
                    obj2 = function1;
                    i6 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((57344 & i4) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i6 |= startRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        if (i14 == 256 || (i6 & 191739611) != 38347922 || !startRestartGroup.getSkipping()) {
                            companion = i22 != 0 ? Modifier.Companion : modifier;
                            textStyle2 = i7 != 0 ? TextStyle.Companion.getDefault() : obj;
                            obj3 = i8 != 0 ? null : obj2;
                            if (i9 != 0) {
                                i10 = TextOverflow.Companion.m5516getClipgIe3tQ8();
                            }
                            z2 = i11 != 0 ? true : z;
                            i15 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            i16 = i13 != 0 ? 1 : i3;
                            colorProducer2 = i14 != 0 ? null : colorProducer;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1186827822, i4, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:79)");
                            }
                            HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            selectionRegistrar = (SelectionRegistrar) consume;
                            startRestartGroup.startReplaceableGroup(959238473);
                            ComposerKt.sourceInformation(startRestartGroup, "96@4735L7,97@4767L190");
                            if (selectionRegistrar != null) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long m1228getBackgroundColor0d7_KjU = ((TextSelectionColors) consume2).m1228getBackgroundColor0d7_KjU();
                                Color m3281boximpl = Color.m3281boximpl(m1228getBackgroundColor0d7_KjU);
                                startRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(m3281boximpl) | startRestartGroup.changed(selectionRegistrar);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new SelectionController(selectionRegistrar, m1228getBackgroundColor0d7_KjU, null, 4, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                selectionController = (SelectionController) rememberedValue;
                            } else {
                                selectionController = null;
                            }
                            startRestartGroup.endReplaceableGroup();
                            if (selectionController == null || obj3 != null) {
                                i17 = i16;
                                i18 = i15;
                                startRestartGroup.startReplaceableGroup(959238907);
                                ComposerKt.sourceInformation(startRestartGroup, "118@5537L7");
                                Modifier m3447graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                AnnotatedString annotatedString = new AnnotatedString(text, null, null, 6, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                m1019textModifierRWo7tUw = m1019textModifierRWo7tUw(m3447graphicsLayerAp8cVGQ$default, annotatedString, textStyle2, obj3, i10, z2, i18, i17, (FontFamily.Resolver) consume3, null, null, selectionController, colorProducer2);
                                startRestartGroup.endReplaceableGroup();
                            } else {
                                startRestartGroup.startReplaceableGroup(959239577);
                                ComposerKt.sourceInformation(startRestartGroup, "130@5988L7");
                                Modifier m3447graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                i17 = i16;
                                i18 = i15;
                                m1019textModifierRWo7tUw = m3447graphicsLayerAp8cVGQ$default2.then(new TextStringSimpleElement(text, textStyle2, (FontFamily.Resolver) consume4, i10, z2, i15, i16, colorProducer2, null));
                                startRestartGroup.endReplaceableGroup();
                            }
                            EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                            startRestartGroup.startReplaceableGroup(544976794);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)122@4734L23,125@4885L385:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1019textModifierRWo7tUw);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                            startRestartGroup.startReplaceableGroup(1405779621);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(new BasicTextKt$BasicTextVhcvRP8$$inlined$Layout$1(constructor));
                            } else {
                                startRestartGroup.useNode();
                            }
                            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                            Updater.m2900setimpl(m2893constructorimpl, emptyMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            Updater.m2900setimpl(m2893constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i19 = i10;
                            z3 = z2;
                            colorProducer3 = colorProducer2;
                            modifier2 = companion;
                            textStyle3 = textStyle2;
                            function12 = obj3;
                            i20 = i17;
                            i21 = i18;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            i21 = i2;
                            colorProducer3 = colorProducer;
                            textStyle3 = obj;
                            function12 = obj2;
                            i19 = i10;
                            z3 = z;
                            i20 = i3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextKt$BasicText$1(text, modifier2, textStyle3, function12, i19, z3, i21, i20, colorProducer3, i4, i5));
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    if (i14 == 256) {
                    }
                    if (i22 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5 = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    selectionRegistrar = (SelectionRegistrar) consume5;
                    startRestartGroup.startReplaceableGroup(959238473);
                    ComposerKt.sourceInformation(startRestartGroup, "96@4735L7,97@4767L190");
                    if (selectionRegistrar != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (selectionController == null) {
                    }
                    i17 = i16;
                    i18 = i15;
                    startRestartGroup.startReplaceableGroup(959238907);
                    ComposerKt.sourceInformation(startRestartGroup, "118@5537L7");
                    Modifier m3447graphicsLayerAp8cVGQ$default3 = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                    AnnotatedString annotatedString2 = new AnnotatedString(text, null, null, 6, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume32 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    m1019textModifierRWo7tUw = m1019textModifierRWo7tUw(m3447graphicsLayerAp8cVGQ$default3, annotatedString2, textStyle2, obj3, i10, z2, i18, i17, (FontFamily.Resolver) consume32, null, null, selectionController, colorProducer2);
                    startRestartGroup.endReplaceableGroup();
                    EmptyMeasurePolicy emptyMeasurePolicy2 = EmptyMeasurePolicy.INSTANCE;
                    startRestartGroup.startReplaceableGroup(544976794);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)122@4734L23,125@4885L385:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1019textModifierRWo7tUw);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    startRestartGroup.startReplaceableGroup(1405779621);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                    Updater.m2900setimpl(m2893constructorimpl, emptyMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m2900setimpl(m2893constructorimpl, materializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (!m2893constructorimpl.getInserting()) {
                    }
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i19 = i10;
                    z3 = z2;
                    colorProducer3 = colorProducer2;
                    modifier2 = companion;
                    textStyle3 = textStyle2;
                    function12 = obj3;
                    i20 = i17;
                    i21 = i18;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                if (i14 == 256) {
                }
                if (i22 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52 = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                selectionRegistrar = (SelectionRegistrar) consume52;
                startRestartGroup.startReplaceableGroup(959238473);
                ComposerKt.sourceInformation(startRestartGroup, "96@4735L7,97@4767L190");
                if (selectionRegistrar != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (selectionController == null) {
                }
                i17 = i16;
                i18 = i15;
                startRestartGroup.startReplaceableGroup(959238907);
                ComposerKt.sourceInformation(startRestartGroup, "118@5537L7");
                Modifier m3447graphicsLayerAp8cVGQ$default32 = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                AnnotatedString annotatedString22 = new AnnotatedString(text, null, null, 6, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume322 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                m1019textModifierRWo7tUw = m1019textModifierRWo7tUw(m3447graphicsLayerAp8cVGQ$default32, annotatedString22, textStyle2, obj3, i10, z2, i18, i17, (FontFamily.Resolver) consume322, null, null, selectionController, colorProducer2);
                startRestartGroup.endReplaceableGroup();
                EmptyMeasurePolicy emptyMeasurePolicy22 = EmptyMeasurePolicy.INSTANCE;
                startRestartGroup.startReplaceableGroup(544976794);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)122@4734L23,125@4885L385:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1019textModifierRWo7tUw);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.Companion.getConstructor();
                startRestartGroup.startReplaceableGroup(1405779621);
                ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, emptyMeasurePolicy22, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m2900setimpl(m2893constructorimpl, materializeModifier22, ComposeUiNode.Companion.getSetModifier());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting()) {
                }
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                i19 = i10;
                z3 = z2;
                colorProducer3 = colorProducer2;
                modifier2 = companion;
                textStyle3 = textStyle2;
                function12 = obj3;
                i20 = i17;
                i21 = i18;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            obj2 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            if (i14 == 256) {
            }
            if (i22 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522 = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionRegistrar = (SelectionRegistrar) consume522;
            startRestartGroup.startReplaceableGroup(959238473);
            ComposerKt.sourceInformation(startRestartGroup, "96@4735L7,97@4767L190");
            if (selectionRegistrar != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (selectionController == null) {
            }
            i17 = i16;
            i18 = i15;
            startRestartGroup.startReplaceableGroup(959238907);
            ComposerKt.sourceInformation(startRestartGroup, "118@5537L7");
            Modifier m3447graphicsLayerAp8cVGQ$default322 = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
            AnnotatedString annotatedString222 = new AnnotatedString(text, null, null, 6, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3222 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            m1019textModifierRWo7tUw = m1019textModifierRWo7tUw(m3447graphicsLayerAp8cVGQ$default322, annotatedString222, textStyle2, obj3, i10, z2, i18, i17, (FontFamily.Resolver) consume3222, null, null, selectionController, colorProducer2);
            startRestartGroup.endReplaceableGroup();
            EmptyMeasurePolicy emptyMeasurePolicy222 = EmptyMeasurePolicy.INSTANCE;
            startRestartGroup.startReplaceableGroup(544976794);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)122@4734L23,125@4885L385:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1019textModifierRWo7tUw);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.Companion.getConstructor();
            startRestartGroup.startReplaceableGroup(1405779621);
            ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, emptyMeasurePolicy222, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m2900setimpl(m2893constructorimpl, materializeModifier222, ComposeUiNode.Companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            i19 = i10;
            z3 = z2;
            colorProducer3 = colorProducer2;
            modifier2 = companion;
            textStyle3 = textStyle2;
            function12 = obj3;
            i20 = i17;
            i21 = i18;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        obj = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        obj2 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        if (i14 == 256) {
        }
        if (i22 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        HeightInLinesModifierKt.validateMinMaxLines(i16, i15);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222 = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        selectionRegistrar = (SelectionRegistrar) consume5222;
        startRestartGroup.startReplaceableGroup(959238473);
        ComposerKt.sourceInformation(startRestartGroup, "96@4735L7,97@4767L190");
        if (selectionRegistrar != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (selectionController == null) {
        }
        i17 = i16;
        i18 = i15;
        startRestartGroup.startReplaceableGroup(959238907);
        ComposerKt.sourceInformation(startRestartGroup, "118@5537L7");
        Modifier m3447graphicsLayerAp8cVGQ$default3222 = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
        AnnotatedString annotatedString2222 = new AnnotatedString(text, null, null, 6, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32222 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        m1019textModifierRWo7tUw = m1019textModifierRWo7tUw(m3447graphicsLayerAp8cVGQ$default3222, annotatedString2222, textStyle2, obj3, i10, z2, i18, i17, (FontFamily.Resolver) consume32222, null, null, selectionController, colorProducer2);
        startRestartGroup.endReplaceableGroup();
        EmptyMeasurePolicy emptyMeasurePolicy2222 = EmptyMeasurePolicy.INSTANCE;
        startRestartGroup.startReplaceableGroup(544976794);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)122@4734L23,125@4885L385:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1019textModifierRWo7tUw);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.Companion.getConstructor();
        startRestartGroup.startReplaceableGroup(1405779621);
        ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
        Updater.m2900setimpl(m2893constructorimpl, emptyMeasurePolicy2222, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m2900setimpl(m2893constructorimpl, materializeModifier2222, ComposeUiNode.Companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!m2893constructorimpl.getInserting()) {
        }
        m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        i19 = i10;
        z3 = z2;
        colorProducer3 = colorProducer2;
        modifier2 = companion;
        textStyle3 = textStyle2;
        function12 = obj3;
        i20 = i17;
        i21 = i18;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:385:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* renamed from: BasicText-RWo7tUw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1016BasicTextRWo7tUw(AnnotatedString text, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, ColorProducer colorProducer, Composer composer, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        SelectionRegistrar selectionRegistrar;
        SelectionController selectionController;
        int i16;
        int i17;
        Composer composer2;
        Map<String, InlineTextContent> map2;
        ColorProducer colorProducer2;
        Map<String, InlineTextContent> map3;
        Modifier modifier2;
        TextStyle textStyle2;
        Function1<? super TextLayoutResult, Unit> function12;
        int i18;
        boolean z2;
        int i19;
        int i20;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1064305212);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)183@8574L7:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i21 = i5 & 2;
        if (i21 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                i6 |= startRestartGroup.changed(textStyle) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i4 & 7168) == 0) {
                    i6 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((57344 & i4) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & 458752) == 0) {
                            i6 |= startRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        i15 = i5 & 512;
                        if (i15 != 0) {
                            i6 |= 268435456;
                        }
                        if ((i5 & ViewUtils.EDGE_TO_EDGE_FLAGS) == 768 || (1533916891 & i6) != 306783378 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i21 != 0 ? Modifier.Companion : modifier;
                            TextStyle textStyle3 = i7 != 0 ? TextStyle.Companion.getDefault() : textStyle;
                            Function1<? super TextLayoutResult, Unit> function13 = i8 != 0 ? null : function1;
                            int m5516getClipgIe3tQ8 = i9 != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i10;
                            boolean z3 = i11 != 0 ? true : z;
                            int i22 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            int i23 = i13 != 0 ? 1 : i3;
                            Map<String, InlineTextContent> emptyMap = i14 != 0 ? MapsKt.emptyMap() : map;
                            ColorProducer colorProducer3 = i15 != 0 ? null : colorProducer;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1064305212, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:167)");
                            }
                            HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            selectionRegistrar = (SelectionRegistrar) consume;
                            startRestartGroup.startReplaceableGroup(959242448);
                            ComposerKt.sourceInformation(startRestartGroup, "185@8710L7,186@8742L190");
                            if (selectionRegistrar != null) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long m1228getBackgroundColor0d7_KjU = ((TextSelectionColors) consume2).m1228getBackgroundColor0d7_KjU();
                                Color m3281boximpl = Color.m3281boximpl(m1228getBackgroundColor0d7_KjU);
                                startRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(m3281boximpl) | startRestartGroup.changed(selectionRegistrar);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new SelectionController(selectionRegistrar, m1228getBackgroundColor0d7_KjU, null, 4, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                selectionController = (SelectionController) rememberedValue;
                            } else {
                                selectionController = null;
                            }
                            startRestartGroup.endReplaceableGroup();
                            if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(text)) {
                                startRestartGroup.startReplaceableGroup(959242835);
                                ComposerKt.sourceInformation(startRestartGroup, "209@9592L7,197@9078L768");
                                Modifier m3447graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Map<String, InlineTextContent> map4 = emptyMap;
                                i16 = i23;
                                i17 = i22;
                                composer2 = startRestartGroup;
                                Modifier m1019textModifierRWo7tUw = m1019textModifierRWo7tUw(m3447graphicsLayerAp8cVGQ$default, text, textStyle3, function13, m5516getClipgIe3tQ8, z3, i22, i23, (FontFamily.Resolver) consume3, null, null, selectionController, colorProducer3);
                                EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                composer2.startReplaceableGroup(544976794);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(1)122@4734L23,125@4885L385:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1019textModifierRWo7tUw);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                                composer2.startReplaceableGroup(1405779621);
                                ComposerKt.sourceInformation(composer2, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(new BasicTextKt$BasicTextRWo7tUw$$inlined$Layout$1(constructor));
                                } else {
                                    composer2.useNode();
                                }
                                Composer m2893constructorimpl = Updater.m2893constructorimpl(composer2);
                                Updater.m2900setimpl(m2893constructorimpl, emptyMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Updater.m2900setimpl(m2893constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                map2 = map4;
                            } else {
                                Map<String, InlineTextContent> map5 = emptyMap;
                                i16 = i23;
                                i17 = i22;
                                composer2 = startRestartGroup;
                                composer2.startReplaceableGroup(959243694);
                                ComposerKt.sourceInformation(composer2, "222@10070L81,238@10733L7,240@10825L43,244@11020L38,225@10160L908");
                                Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> resolveInlineContent = AnnotatedStringResolveInlineContentKt.resolveInlineContent(text, map5);
                                List<AnnotatedString.Range<Placeholder>> component1 = resolveInlineContent.component1();
                                List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> component2 = resolveInlineContent.component2();
                                composer2.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue2 = composer2.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    composer2.updateRememberedValue(rememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                MutableState mutableState = (MutableState) rememberedValue2;
                                Modifier m3447graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer2.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                FontFamily.Resolver resolver = (FontFamily.Resolver) consume4;
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean changed2 = composer2.changed(mutableState);
                                BasicTextKt$BasicText$3$1 rememberedValue3 = composer2.rememberedValue();
                                if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                    rememberedValue3 = new BasicTextKt$BasicText$3$1(mutableState);
                                    composer2.updateRememberedValue(rememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                int i24 = i6;
                                map2 = map5;
                                Modifier m1019textModifierRWo7tUw2 = m1019textModifierRWo7tUw(m3447graphicsLayerAp8cVGQ$default2, text, textStyle3, function13, m5516getClipgIe3tQ8, z3, i17, i16, resolver, component1, rememberedValue3, selectionController, colorProducer3);
                                composer2.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                boolean changed3 = composer2.changed(mutableState);
                                BasicTextKt$BasicText$4$1 rememberedValue4 = composer2.rememberedValue();
                                if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                    rememberedValue4 = new BasicTextKt$BasicText$4$1(mutableState);
                                    composer2.updateRememberedValue(rememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                TextMeasurePolicy textMeasurePolicy = new TextMeasurePolicy((Function0) rememberedValue4);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m1019textModifierRWo7tUw2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer2);
                                Updater.m2900setimpl(m2893constructorimpl2, textMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, 1350731549, "C226@10192L63:BasicText.kt#423gt5");
                                AnnotatedStringResolveInlineContentKt.InlineChildren(text, component2, composer2, (i24 & 14) | 64);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            colorProducer2 = colorProducer3;
                            map3 = map2;
                            modifier2 = companion;
                            textStyle2 = textStyle3;
                            function12 = function13;
                            i18 = m5516getClipgIe3tQ8;
                            z2 = z3;
                            i19 = i16;
                            i20 = i17;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            textStyle2 = textStyle;
                            function12 = function1;
                            z2 = z;
                            i20 = i2;
                            i19 = i3;
                            map3 = map;
                            i18 = i10;
                            composer2 = startRestartGroup;
                            colorProducer2 = colorProducer;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextKt$BasicText$5(text, modifier2, textStyle2, function12, i18, z2, i20, i19, map3, colorProducer2, i4, i5));
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i5 & 512;
                    if (i15 != 0) {
                    }
                    if ((i5 & ViewUtils.EDGE_TO_EDGE_FLAGS) == 768) {
                    }
                    if (i21 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume5 = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    selectionRegistrar = (SelectionRegistrar) consume5;
                    startRestartGroup.startReplaceableGroup(959242448);
                    ComposerKt.sourceInformation(startRestartGroup, "185@8710L7,186@8742L190");
                    if (selectionRegistrar != null) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(text)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    colorProducer2 = colorProducer3;
                    map3 = map2;
                    modifier2 = companion;
                    textStyle2 = textStyle3;
                    function12 = function13;
                    i18 = m5516getClipgIe3tQ8;
                    z2 = z3;
                    i19 = i16;
                    i20 = i17;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                i15 = i5 & 512;
                if (i15 != 0) {
                }
                if ((i5 & ViewUtils.EDGE_TO_EDGE_FLAGS) == 768) {
                }
                if (i21 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume52 = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                selectionRegistrar = (SelectionRegistrar) consume52;
                startRestartGroup.startReplaceableGroup(959242448);
                ComposerKt.sourceInformation(startRestartGroup, "185@8710L7,186@8742L190");
                if (selectionRegistrar != null) {
                }
                startRestartGroup.endReplaceableGroup();
                if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(text)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                colorProducer2 = colorProducer3;
                map3 = map2;
                modifier2 = companion;
                textStyle2 = textStyle3;
                function12 = function13;
                i18 = m5516getClipgIe3tQ8;
                z2 = z3;
                i19 = i16;
                i20 = i17;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            if ((i5 & ViewUtils.EDGE_TO_EDGE_FLAGS) == 768) {
            }
            if (i21 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume522 = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionRegistrar = (SelectionRegistrar) consume522;
            startRestartGroup.startReplaceableGroup(959242448);
            ComposerKt.sourceInformation(startRestartGroup, "185@8710L7,186@8742L190");
            if (selectionRegistrar != null) {
            }
            startRestartGroup.endReplaceableGroup();
            if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(text)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            colorProducer2 = colorProducer3;
            map3 = map2;
            modifier2 = companion;
            textStyle2 = textStyle3;
            function12 = function13;
            i18 = m5516getClipgIe3tQ8;
            z2 = z3;
            i19 = i16;
            i20 = i17;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        if ((i5 & ViewUtils.EDGE_TO_EDGE_FLAGS) == 768) {
        }
        if (i21 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        HeightInLinesModifierKt.validateMinMaxLines(i23, i22);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume5222 = startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        selectionRegistrar = (SelectionRegistrar) consume5222;
        startRestartGroup.startReplaceableGroup(959242448);
        ComposerKt.sourceInformation(startRestartGroup, "185@8710L7,186@8742L190");
        if (selectionRegistrar != null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (!AnnotatedStringResolveInlineContentKt.hasInlineContent(text)) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        colorProducer2 = colorProducer3;
        map3 = map2;
        modifier2 = companion;
        textStyle2 = textStyle3;
        function12 = function13;
        i18 = m5516getClipgIe3tQ8;
        z2 = z3;
        i19 = i16;
        i20 = i17;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-BpD7jsM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1015BasicTextBpD7jsM(String text, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        Object obj;
        int i7;
        Object obj2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        boolean z3;
        int i13;
        Modifier modifier2;
        TextStyle textStyle2;
        Function1 function12;
        int i14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(1022429478);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)260@11460L234:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                obj = textStyle;
                i5 |= startRestartGroup.changed(obj) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i3 & 7168) == 0) {
                    obj2 = function1;
                    i5 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i3 & 458752) == 0) {
                                i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            i12 = i2;
                        } else {
                            i12 = i2;
                            if ((i3 & 3670016) == 0) {
                                i5 |= startRestartGroup.changed(i12) ? 1048576 : 524288;
                            }
                        }
                        if ((i5 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i15 != 0 ? Modifier.Companion : modifier;
                            TextStyle textStyle3 = i6 != 0 ? TextStyle.Companion.getDefault() : obj;
                            Object obj3 = i7 != 0 ? null : obj2;
                            int m5516getClipgIe3tQ8 = i8 != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i9;
                            if (i10 != 0) {
                                z2 = true;
                            }
                            int i16 = i11 != 0 ? Integer.MAX_VALUE : i12;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1022429478, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:251)");
                            }
                            m1018BasicTextVhcvRP8(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z2, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z2;
                            i13 = i16;
                            modifier2 = companion;
                            textStyle2 = textStyle3;
                            function12 = obj3;
                            i14 = m5516getClipgIe3tQ8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            textStyle2 = obj;
                            function12 = obj2;
                            i13 = i12;
                            i14 = i9;
                            z3 = z2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextKt$BasicText$6(text, modifier2, textStyle2, function12, i14, z3, i13, i3, i4));
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i5 & 2995931) == 599186) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m1018BasicTextVhcvRP8(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z2, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z2;
                    i13 = i16;
                    modifier2 = companion;
                    textStyle2 = textStyle3;
                    function12 = obj3;
                    i14 = m5516getClipgIe3tQ8;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i5 & 2995931) == 599186) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                m1018BasicTextVhcvRP8(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z2, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z2;
                i13 = i16;
                modifier2 = companion;
                textStyle2 = textStyle3;
                function12 = obj3;
                i14 = m5516getClipgIe3tQ8;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            obj2 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i5 & 2995931) == 599186) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m1018BasicTextVhcvRP8(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z2, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z2;
            i13 = i16;
            modifier2 = companion;
            textStyle2 = textStyle3;
            function12 = obj3;
            i14 = m5516getClipgIe3tQ8;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        obj = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        obj2 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i5 & 2995931) == 599186) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        m1018BasicTextVhcvRP8(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z2, i16, 1, (ColorProducer) null, startRestartGroup, 12582912 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z2;
        i13 = i16;
        modifier2 = companion;
        textStyle2 = textStyle3;
        function12 = obj3;
        i14 = m5516getClipgIe3tQ8;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-4YKlhWE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1013BasicText4YKlhWE(AnnotatedString text, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Map map, Composer composer, int i3, int i4) {
        int i5;
        int i6;
        Object obj;
        int i7;
        Object obj2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        Composer composer2;
        boolean z3;
        int i13;
        Modifier modifier2;
        TextStyle textStyle2;
        Function1 function12;
        int i14;
        Map map2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-648605928);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)284@12151L273:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                obj = textStyle;
                i5 |= startRestartGroup.changed(obj) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i3 & 7168) == 0) {
                    obj2 = function1;
                    i5 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i3 & 458752) == 0) {
                                i5 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            i5 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i12 = i4 & 128;
                        if (i12 != 0) {
                            i5 |= 4194304;
                        }
                        if (i12 == 128 || (23967451 & i5) != 4793490 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i15 != 0 ? Modifier.Companion : modifier;
                            TextStyle textStyle3 = i6 != 0 ? TextStyle.Companion.getDefault() : obj;
                            Object obj3 = i7 != 0 ? null : obj2;
                            int m5516getClipgIe3tQ8 = i8 != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i9;
                            boolean z4 = i10 != 0 ? true : z2;
                            int i16 = i11 != 0 ? Integer.MAX_VALUE : i2;
                            Map emptyMap = i12 != 0 ? MapsKt.emptyMap() : map;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-648605928, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:274)");
                            }
                            composer2 = startRestartGroup;
                            m1016BasicTextRWo7tUw(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            i13 = i16;
                            modifier2 = companion;
                            textStyle2 = textStyle3;
                            function12 = obj3;
                            i14 = m5516getClipgIe3tQ8;
                            map2 = emptyMap;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            i13 = i2;
                            textStyle2 = obj;
                            function12 = obj2;
                            z3 = z2;
                            i14 = i9;
                            composer2 = startRestartGroup;
                            map2 = map;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextKt$BasicText$7(text, modifier2, textStyle2, function12, i14, z3, i13, map2, i3, i4));
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                    }
                    if (i12 == 128) {
                    }
                    if (i15 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    m1016BasicTextRWo7tUw(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                    i13 = i16;
                    modifier2 = companion;
                    textStyle2 = textStyle3;
                    function12 = obj3;
                    i14 = m5516getClipgIe3tQ8;
                    map2 = emptyMap;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj2 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                }
                if (i12 == 128) {
                }
                if (i15 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                m1016BasicTextRWo7tUw(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z4;
                i13 = i16;
                modifier2 = companion;
                textStyle2 = textStyle3;
                function12 = obj3;
                i14 = m5516getClipgIe3tQ8;
                map2 = emptyMap;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            obj = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            obj2 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            i12 = i4 & 128;
            if (i12 != 0) {
            }
            if (i12 == 128) {
            }
            if (i15 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            m1016BasicTextRWo7tUw(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
            i13 = i16;
            modifier2 = companion;
            textStyle2 = textStyle3;
            function12 = obj3;
            i14 = m5516getClipgIe3tQ8;
            map2 = emptyMap;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        obj = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        obj2 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        i12 = i4 & 128;
        if (i12 != 0) {
        }
        if (i12 == 128) {
        }
        if (i15 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        m1016BasicTextRWo7tUw(text, companion, textStyle3, obj3, m5516getClipgIe3tQ8, z4, i16, 1, emptyMap, null, startRestartGroup, 146800640 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752) | (i5 & 3670016), 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z4;
        i13 = i16;
        modifier2 = companion;
        textStyle2 = textStyle3;
        function12 = obj3;
        i14 = m5516getClipgIe3tQ8;
        map2 = emptyMap;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-4YKlhWE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1014BasicText4YKlhWE(String text, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Composer composer, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        Object obj;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        Modifier modifier2;
        TextStyle textStyle2;
        Function1 function12;
        int i15;
        boolean z3;
        int i16;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(1542716361);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)308@12822L86:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i17 = i5 & 2;
        if (i17 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                i6 |= startRestartGroup.changed(textStyle) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i4 & 7168) == 0) {
                    obj = function1;
                    i6 |= startRestartGroup.changedInstance(obj) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i4 & 458752) == 0) {
                                i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        if ((i6 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i17 != 0 ? Modifier.Companion : modifier;
                            TextStyle textStyle3 = i7 != 0 ? TextStyle.Companion.getDefault() : textStyle;
                            Object obj2 = i8 != 0 ? null : obj;
                            int m5516getClipgIe3tQ8 = i9 != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i10;
                            boolean z4 = i11 != 0 ? true : z2;
                            int i18 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            int i19 = i13 != 0 ? 1 : i3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1542716361, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:299)");
                            }
                            m1018BasicTextVhcvRP8(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i18, i19, (ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i14 = i18;
                            modifier2 = companion;
                            textStyle2 = textStyle3;
                            function12 = obj2;
                            i15 = m5516getClipgIe3tQ8;
                            z3 = z4;
                            i16 = i19;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            textStyle2 = textStyle;
                            i16 = i3;
                            function12 = obj;
                            z3 = z2;
                            i15 = i10;
                            i14 = i2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextKt$BasicText$8(text, modifier2, textStyle2, function12, i15, z3, i14, i16, i4, i5));
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    if ((i6 & 23967451) == 4793490) {
                    }
                    if (i17 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m1018BasicTextVhcvRP8(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i18, i19, (ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i14 = i18;
                    modifier2 = companion;
                    textStyle2 = textStyle3;
                    function12 = obj2;
                    i15 = m5516getClipgIe3tQ8;
                    z3 = z4;
                    i16 = i19;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                if ((i6 & 23967451) == 4793490) {
                }
                if (i17 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                m1018BasicTextVhcvRP8(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i18, i19, (ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
                if (ComposerKt.isTraceInProgress()) {
                }
                i14 = i18;
                modifier2 = companion;
                textStyle2 = textStyle3;
                function12 = obj2;
                i15 = m5516getClipgIe3tQ8;
                z3 = z4;
                i16 = i19;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            obj = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            if ((i6 & 23967451) == 4793490) {
            }
            if (i17 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            m1018BasicTextVhcvRP8(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i18, i19, (ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
            if (ComposerKt.isTraceInProgress()) {
            }
            i14 = i18;
            modifier2 = companion;
            textStyle2 = textStyle3;
            function12 = obj2;
            i15 = m5516getClipgIe3tQ8;
            z3 = z4;
            i16 = i19;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        obj = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        if ((i6 & 23967451) == 4793490) {
        }
        if (i17 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        m1018BasicTextVhcvRP8(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i18, i19, (ColorProducer) null, startRestartGroup, (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 256);
        if (ComposerKt.isTraceInProgress()) {
        }
        i14 = i18;
        modifier2 = companion;
        textStyle2 = textStyle3;
        function12 = obj2;
        i15 = m5516getClipgIe3tQ8;
        z3 = z4;
        i16 = i19;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-VhcvRP8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1017BasicTextVhcvRP8(AnnotatedString text, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Map map, Composer composer, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        Object obj;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        boolean z3;
        int i15;
        Modifier modifier2;
        TextStyle textStyle2;
        Function1 function12;
        int i16;
        int i17;
        Map map2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(851408699);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)322@13374L240:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i18 = i5 & 2;
        if (i18 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 896) == 0) {
                i6 |= startRestartGroup.changed(textStyle) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i4 & 7168) == 0) {
                    obj = function1;
                    i6 |= startRestartGroup.changedInstance(obj) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? 16384 : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i4 & 458752) == 0) {
                                i6 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 3670016) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 29360128) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i6 |= 33554432;
                        }
                        if (i14 == 256 || (191739611 & i6) != 38347922 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i18 != 0 ? Modifier.Companion : modifier;
                            TextStyle textStyle3 = i7 != 0 ? TextStyle.Companion.getDefault() : textStyle;
                            Object obj2 = i8 != 0 ? null : obj;
                            int m5516getClipgIe3tQ8 = i9 != 0 ? TextOverflow.Companion.m5516getClipgIe3tQ8() : i10;
                            boolean z4 = i11 != 0 ? true : z2;
                            int i19 = i12 != 0 ? Integer.MAX_VALUE : i2;
                            int i20 = i13 != 0 ? 1 : i3;
                            Map emptyMap = i14 != 0 ? MapsKt.emptyMap() : map;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(851408699, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:312)");
                            }
                            composer2 = startRestartGroup;
                            m1016BasicTextRWo7tUw(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i19, i20, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            i15 = i19;
                            modifier2 = companion;
                            textStyle2 = textStyle3;
                            function12 = obj2;
                            i16 = m5516getClipgIe3tQ8;
                            i17 = i20;
                            map2 = emptyMap;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            textStyle2 = textStyle;
                            i15 = i2;
                            map2 = map;
                            function12 = obj;
                            z3 = z2;
                            i16 = i10;
                            composer2 = startRestartGroup;
                            i17 = i3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new BasicTextKt$BasicText$9(text, modifier2, textStyle2, function12, i16, z3, i15, i17, map2, i4, i5));
                        return;
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    if (i14 == 256) {
                    }
                    if (i18 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    m1016BasicTextRWo7tUw(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i19, i20, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                    i15 = i19;
                    modifier2 = companion;
                    textStyle2 = textStyle3;
                    function12 = obj2;
                    i16 = m5516getClipgIe3tQ8;
                    i17 = i20;
                    map2 = emptyMap;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                obj = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                if (i14 == 256) {
                }
                if (i18 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                m1016BasicTextRWo7tUw(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i19, i20, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z4;
                i15 = i19;
                modifier2 = companion;
                textStyle2 = textStyle3;
                function12 = obj2;
                i16 = m5516getClipgIe3tQ8;
                i17 = i20;
                map2 = emptyMap;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            obj = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            if (i14 == 256) {
            }
            if (i18 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            m1016BasicTextRWo7tUw(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i19, i20, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
            i15 = i19;
            modifier2 = companion;
            textStyle2 = textStyle3;
            function12 = obj2;
            i16 = m5516getClipgIe3tQ8;
            i17 = i20;
            map2 = emptyMap;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        obj = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        if (i14 == 256) {
        }
        if (i18 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        m1016BasicTextRWo7tUw(text, companion, textStyle3, obj2, m5516getClipgIe3tQ8, z4, i19, i20, emptyMap, null, startRestartGroup, 134217728 | (i6 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128), 512);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z4;
        i15 = i19;
        modifier2 = companion;
        textStyle2 = textStyle3;
        function12 = obj2;
        i16 = m5516getClipgIe3tQ8;
        i17 = i20;
        map2 = emptyMap;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Saver<Long, Long> selectionIdSaver(SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new BasicTextKt$selectionIdSaver$1(selectionRegistrar), BasicTextKt$selectionIdSaver$2.INSTANCE);
    }

    /* renamed from: textModifier-RWo7tUw */
    private static final Modifier m1019textModifierRWo7tUw(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer) {
        if (selectionController == null) {
            return modifier.then(Modifier.Companion).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, null, colorProducer, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer, null));
    }
}
