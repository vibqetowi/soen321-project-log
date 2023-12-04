package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jµ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2e\u0010\u000f\u001aa\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a²\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\bX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0206, code lost:
        if (r32 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024d, code lost:
        if (r32 != false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f8  */
    /* renamed from: Transition-DTcfvLk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1529TransitionDTcfvLk(InputPhase inputState, long j, long j2, Function3<? super InputPhase, ? super Composer, ? super Integer, Color> contentColor, boolean z, Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        String str;
        float f;
        String str2;
        int i3;
        int i4;
        float f2;
        int i5;
        float f3;
        int i6;
        float f4;
        boolean changed;
        TwoWayConverter<Color, AnimationVector4D> rememberedValue;
        boolean changed2;
        TwoWayConverter<Color, AnimationVector4D> rememberedValue2;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1988729962);
        ComposerKt.sourceInformation(startRestartGroup, "C(Transition)P(3,2:c#ui.graphics.Color,5:c#ui.graphics.Color,1,4)278@11377L59,280@11478L325,291@11850L1101,319@12999L299,329@13344L186,335@13540L140:TextFieldImpl.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(inputState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(contentColor) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1988729962, i2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:262)");
            }
            Transition updateTransition = TransitionKt.updateTransition(inputState, "TextFieldInputState", startRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = TextFieldTransitionScope$Transition$labelProgress$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli");
            InputPhase inputPhase = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1158004136);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                str = "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli";
                ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:283)");
            } else {
                str = "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli";
            }
            int i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    f = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase2 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1158004136);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                        str2 = "C:TextFieldImpl.kt#jmzs0o";
                        i3 = -1;
                    } else {
                        str2 = "C:TextFieldImpl.kt#jmzs0o";
                        i3 = -1;
                        ComposerKt.traceEventStart(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:283)");
                    }
                    i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase2.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            f2 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceableGroup();
                            String str3 = str2;
                            int i8 = i3;
                            String str4 = str;
                            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-1338768149);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, str4);
                            InputPhase inputPhase3 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1376159017);
                            ComposerKt.sourceInformation(startRestartGroup, str3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1376159017, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                            }
                            i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase3.ordinal()];
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                f3 = 0.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                startRestartGroup.endReplaceableGroup();
                                Float valueOf2 = Float.valueOf(f3);
                                InputPhase inputPhase4 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1376159017);
                                ComposerKt.sourceInformation(startRestartGroup, str3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1376159017, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:311)");
                                }
                                i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase4.ordinal()];
                                if (i6 != 1) {
                                    if (i6 != 2) {
                                        if (i6 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    f4 = 0.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
                                    startRestartGroup.startReplaceableGroup(-1939694975);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                    InputPhase inputPhase5 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    ComposerKt.sourceInformation(startRestartGroup, str3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490209928, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                                    }
                                    long j3 = WhenMappings.$EnumSwitchMapping$0[inputPhase5.ordinal()] == 1 ? j : j2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    ColorSpace m3295getColorSpaceimpl = Color.m3295getColorSpaceimpl(j3);
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    changed = startRestartGroup.changed(m3295getColorSpaceimpl);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
                                    startRestartGroup.startReplaceableGroup(-142660079);
                                    ComposerKt.sourceInformation(startRestartGroup, str4);
                                    InputPhase inputPhase6 = (InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    ComposerKt.sourceInformation(startRestartGroup, str3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490209928, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                                    }
                                    long j4 = WhenMappings.$EnumSwitchMapping$0[inputPhase6.ordinal()] == 1 ? j : j2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    Color m3281boximpl = Color.m3281boximpl(j4);
                                    InputPhase inputPhase7 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1490209928);
                                    ComposerKt.sourceInformation(startRestartGroup, str3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490209928, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:322)");
                                    }
                                    long j5 = WhenMappings.$EnumSwitchMapping$0[inputPhase7.ordinal()] == 1 ? j : j2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, 229376);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
                                    int i9 = (i2 & 7168) | 384;
                                    startRestartGroup.startReplaceableGroup(-1939694975);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                    ColorSpace m3295getColorSpaceimpl2 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i9 >> 6) & 112)).m3301unboximpl());
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    changed2 = startRestartGroup.changed(m3295getColorSpaceimpl2);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl2);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    int i10 = i9 << 3;
                                    int i11 = (i10 & 57344) | (i9 & 14) | 64 | (i10 & 896) | (i10 & 7168);
                                    startRestartGroup.startReplaceableGroup(-142660079);
                                    ComposerKt.sourceInformation(startRestartGroup, str4);
                                    int i12 = (i11 >> 9) & 112;
                                    State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i12)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i12)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i11 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i11 & 14) | ((i11 << 9) & 57344) | ((i11 << 6) & 458752));
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3281boximpl(Transition_DTcfvLk$lambda$5(createTransitionAnimation3)), Color.m3281boximpl(Transition_DTcfvLk$lambda$6(createTransitionAnimation4)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                f4 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
                                startRestartGroup.startReplaceableGroup(-1939694975);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                InputPhase inputPhase52 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                ComposerKt.sourceInformation(startRestartGroup, str3);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase52.ordinal()] == 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                ColorSpace m3295getColorSpaceimpl3 = Color.m3295getColorSpaceimpl(j3);
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(m3295getColorSpaceimpl3);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl3);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceableGroup();
                                TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue;
                                startRestartGroup.startReplaceableGroup(-142660079);
                                ComposerKt.sourceInformation(startRestartGroup, str4);
                                InputPhase inputPhase62 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                ComposerKt.sourceInformation(startRestartGroup, str3);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase62.ordinal()] == 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                Color m3281boximpl2 = Color.m3281boximpl(j4);
                                InputPhase inputPhase72 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1490209928);
                                ComposerKt.sourceInformation(startRestartGroup, str3);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase72.ordinal()] == 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl2, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter2, "LabelTextStyleColor", startRestartGroup, 229376);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
                                int i92 = (i2 & 7168) | 384;
                                startRestartGroup.startReplaceableGroup(-1939694975);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                ColorSpace m3295getColorSpaceimpl22 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i92 >> 6) & 112)).m3301unboximpl());
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(m3295getColorSpaceimpl22);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue2 = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl22);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                startRestartGroup.endReplaceableGroup();
                                int i102 = i92 << 3;
                                int i112 = (i102 & 57344) | (i92 & 14) | 64 | (i102 & 896) | (i102 & 7168);
                                startRestartGroup.startReplaceableGroup(-142660079);
                                ComposerKt.sourceInformation(startRestartGroup, str4);
                                int i122 = (i112 >> 9) & 112;
                                State createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i122)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i122)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i112 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i112 & 14) | ((i112 << 9) & 57344) | ((i112 << 6) & 458752));
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3281boximpl(Transition_DTcfvLk$lambda$5(createTransitionAnimation32)), Color.m3281boximpl(Transition_DTcfvLk$lambda$6(createTransitionAnimation42)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation22)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                            f3 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf22 = Float.valueOf(f3);
                            InputPhase inputPhase42 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1376159017);
                            ComposerKt.sourceInformation(startRestartGroup, str3);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase42.ordinal()];
                            if (i6 != 1) {
                            }
                            f4 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-1939694975);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                            InputPhase inputPhase522 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            ComposerKt.sourceInformation(startRestartGroup, str3);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase522.ordinal()] == 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            ColorSpace m3295getColorSpaceimpl32 = Color.m3295getColorSpaceimpl(j3);
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(m3295getColorSpaceimpl32);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl32);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceableGroup();
                            TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue;
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, str4);
                            InputPhase inputPhase622 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            ComposerKt.sourceInformation(startRestartGroup, str3);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase622.ordinal()] == 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Color m3281boximpl22 = Color.m3281boximpl(j4);
                            InputPhase inputPhase722 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1490209928);
                            ComposerKt.sourceInformation(startRestartGroup, str3);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase722.ordinal()] == 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl22, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter22, "LabelTextStyleColor", startRestartGroup, 229376);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$222 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
                            int i922 = (i2 & 7168) | 384;
                            startRestartGroup.startReplaceableGroup(-1939694975);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                            ColorSpace m3295getColorSpaceimpl222 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i922 >> 6) & 112)).m3301unboximpl());
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed2 = startRestartGroup.changed(m3295getColorSpaceimpl222);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl222);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceableGroup();
                            int i1022 = i922 << 3;
                            int i1122 = (i1022 & 57344) | (i922 & 14) | 64 | (i1022 & 896) | (i1022 & 7168);
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, str4);
                            int i1222 = (i1122 >> 9) & 112;
                            State createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i1222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i1222)), textFieldTransitionScope$Transition$labelContentColor$222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i1122 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i1122 & 14) | ((i1122 << 9) & 57344) | ((i1122 << 6) & 458752));
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3281boximpl(Transition_DTcfvLk$lambda$5(createTransitionAnimation322)), Color.m3281boximpl(Transition_DTcfvLk$lambda$6(createTransitionAnimation422)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation222)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        } else if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    String str32 = str2;
                    int i82 = i3;
                    String str42 = str;
                    State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-1338768149);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, str42);
                    InputPhase inputPhase32 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1376159017);
                    ComposerKt.sourceInformation(startRestartGroup, str32);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase32.ordinal()];
                    if (i5 != 1) {
                    }
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf222 = Float.valueOf(f3);
                    InputPhase inputPhase422 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1376159017);
                    ComposerKt.sourceInformation(startRestartGroup, str32);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase422.ordinal()];
                    if (i6 != 1) {
                    }
                    f4 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$22.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2222 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-1939694975);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                    InputPhase inputPhase5222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    ComposerKt.sourceInformation(startRestartGroup, str32);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase5222.ordinal()] == 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    ColorSpace m3295getColorSpaceimpl322 = Color.m3295getColorSpaceimpl(j3);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(m3295getColorSpaceimpl322);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl322);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, str42);
                    InputPhase inputPhase6222 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    ComposerKt.sourceInformation(startRestartGroup, str32);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase6222.ordinal()] == 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Color m3281boximpl222 = Color.m3281boximpl(j4);
                    InputPhase inputPhase7222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1490209928);
                    ComposerKt.sourceInformation(startRestartGroup, str32);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase7222.ordinal()] == 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl222, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter222, "LabelTextStyleColor", startRestartGroup, 229376);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2222 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
                    int i9222 = (i2 & 7168) | 384;
                    startRestartGroup.startReplaceableGroup(-1939694975);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                    ColorSpace m3295getColorSpaceimpl2222 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i9222 >> 6) & 112)).m3301unboximpl());
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(m3295getColorSpaceimpl2222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl2222);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    int i10222 = i9222 << 3;
                    int i11222 = (i10222 & 57344) | (i9222 & 14) | 64 | (i10222 & 896) | (i10222 & 7168);
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, str42);
                    int i12222 = (i11222 >> 9) & 112;
                    State createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i12222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i12222)), textFieldTransitionScope$Transition$labelContentColor$2222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i11222 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i11222 & 14) | ((i11222 << 9) & 57344) | ((i11222 << 6) & 458752));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation5)), Color.m3281boximpl(Transition_DTcfvLk$lambda$5(createTransitionAnimation3222)), Color.m3281boximpl(Transition_DTcfvLk$lambda$6(createTransitionAnimation4222)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2222)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf3 = Float.valueOf(f);
            InputPhase inputPhase22 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1158004136);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase22.ordinal()];
            if (i4 != 1) {
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            String str322 = str2;
            int i822 = i3;
            String str422 = str;
            State createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, str422);
            InputPhase inputPhase322 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1376159017);
            ComposerKt.sourceInformation(startRestartGroup, str322);
            if (ComposerKt.isTraceInProgress()) {
            }
            i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase322.ordinal()];
            if (i5 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf2222 = Float.valueOf(f3);
            InputPhase inputPhase4222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1376159017);
            ComposerKt.sourceInformation(startRestartGroup, str322);
            if (ComposerKt.isTraceInProgress()) {
            }
            i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase4222.ordinal()];
            if (i6 != 1) {
            }
            f4 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation22222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$222.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22222 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1939694975);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            InputPhase inputPhase52222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            ComposerKt.sourceInformation(startRestartGroup, str322);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase52222.ordinal()] == 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            ColorSpace m3295getColorSpaceimpl3222 = Color.m3295getColorSpaceimpl(j3);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m3295getColorSpaceimpl3222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl3222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter2222 = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, str422);
            InputPhase inputPhase62222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            ComposerKt.sourceInformation(startRestartGroup, str322);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase62222.ordinal()] == 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Color m3281boximpl2222 = Color.m3281boximpl(j4);
            InputPhase inputPhase72222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1490209928);
            ComposerKt.sourceInformation(startRestartGroup, str322);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase72222.ordinal()] == 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation32222 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl2222, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter2222, "LabelTextStyleColor", startRestartGroup, 229376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22222 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
            int i92222 = (i2 & 7168) | 384;
            startRestartGroup.startReplaceableGroup(-1939694975);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            ColorSpace m3295getColorSpaceimpl22222 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i92222 >> 6) & 112)).m3301unboximpl());
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(m3295getColorSpaceimpl22222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl22222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            int i102222 = i92222 << 3;
            int i112222 = (i102222 & 57344) | (i92222 & 14) | 64 | (i102222 & 896) | (i102222 & 7168);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, str422);
            int i122222 = (i112222 >> 9) & 112;
            State createTransitionAnimation42222 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i122222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i122222)), textFieldTransitionScope$Transition$labelContentColor$22222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i112222 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i112222 & 14) | ((i112222 << 9) & 57344) | ((i112222 << 6) & 458752));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation52)), Color.m3281boximpl(Transition_DTcfvLk$lambda$5(createTransitionAnimation32222)), Color.m3281boximpl(Transition_DTcfvLk$lambda$6(createTransitionAnimation42222)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation22222)), startRestartGroup, Integer.valueOf((i2 >> 3) & 57344));
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextFieldTransitionScope$Transition$1(this, inputState, j, j2, contentColor, z, content, i));
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }
}
