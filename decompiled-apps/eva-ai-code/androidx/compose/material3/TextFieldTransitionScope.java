package androidx.compose.material3;

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
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÊ\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2z\u0010\u000f\u001av\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/TextFieldTransitionScope;", "", "()V", "Transition", "", "inputState", "Landroidx/compose/material3/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function5;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material3/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0201, code lost:
        if (r32 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0248, code lost:
        if (r32 != false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    /* renamed from: Transition-DTcfvLk  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2143TransitionDTcfvLk(InputPhase inputState, long j, long j2, Function3<? super InputPhase, ? super Composer, ? super Integer, Color> contentColor, boolean z, Function7<? super Float, ? super Color, ? super Color, ? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        float f;
        String str;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        float f5;
        int i7;
        boolean changed;
        TwoWayConverter<Color, AnimationVector4D> rememberedValue;
        boolean changed2;
        TwoWayConverter<Color, AnimationVector4D> rememberedValue2;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(contentColor, "contentColor");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-995111872);
        ComposerKt.sourceInformation(startRestartGroup, "C(Transition)P(3,2:c#ui.graphics.Color,5:c#ui.graphics.Color,1,4)310@12822L59,312@12923L325,323@13295L1101,351@14444L354,362@14846L299,372@15191L186,378@15387L174:TextFieldImpl.kt#uh7d8r");
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
                ComposerKt.traceEventStart(-995111872, i2, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition (TextFieldImpl.kt:293)");
            }
            Transition updateTransition = TransitionKt.updateTransition(inputState, "TextFieldInputState", startRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = TextFieldTransitionScope$Transition$labelProgress$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
            InputPhase inputPhase = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(240378898);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240378898, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
            }
            int i8 = WhenMappings.$EnumSwitchMapping$0[inputPhase.ordinal()];
            float f6 = 1.0f;
            if (i8 != 1) {
                if (i8 == 2) {
                    f = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase2 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(240378898);
                    ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        str = "C:TextFieldImpl.kt#uh7d8r";
                    } else {
                        str = "C:TextFieldImpl.kt#uh7d8r";
                        ComposerKt.traceEventStart(240378898, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:315)");
                    }
                    i3 = WhenMappings.$EnumSwitchMapping$0[inputPhase2.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            f2 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceableGroup();
                            String str2 = str;
                            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-1338768149);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                            InputPhase inputPhase3 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(2067512179);
                            ComposerKt.sourceInformation(startRestartGroup, str2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
                            }
                            i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase3.ordinal()];
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
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
                                startRestartGroup.startReplaceableGroup(2067512179);
                                ComposerKt.sourceInformation(startRestartGroup, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2067512179, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:343)");
                                }
                                i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase4.ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
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
                                    TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$2 = TextFieldTransitionScope$Transition$prefixSuffixOpacity$2.INSTANCE;
                                    startRestartGroup.startReplaceableGroup(-1338768149);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                    startRestartGroup.startReplaceableGroup(-142660079);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                                    InputPhase inputPhase5 = (InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceableGroup(5829913);
                                    ComposerKt.sourceInformation(startRestartGroup, str2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                                    }
                                    i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase5.ordinal()];
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            if (i6 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        } else if (z) {
                                            f5 = 0.0f;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            Float valueOf3 = Float.valueOf(f5);
                                            InputPhase inputPhase6 = (InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceableGroup(5829913);
                                            ComposerKt.sourceInformation(startRestartGroup, str2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(5829913, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:354)");
                                            }
                                            i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase6.ordinal()];
                                            if (i7 != 1) {
                                                if (i7 != 2) {
                                                    if (i7 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                } else if (z) {
                                                    f6 = 0.0f;
                                                }
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$2.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.endReplaceableGroup();
                                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
                                            startRestartGroup.startReplaceableGroup(-1939694975);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                            InputPhase inputPhase7 = (InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceableGroup(-1468066062);
                                            ComposerKt.sourceInformation(startRestartGroup, str2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                                            }
                                            long j3 = WhenMappings.$EnumSwitchMapping$0[inputPhase7.ordinal()] != 1 ? j : j2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            ColorSpace m3295getColorSpaceimpl = Color.m3295getColorSpaceimpl(j3);
                                            startRestartGroup.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                            changed = startRestartGroup.changed(m3295getColorSpaceimpl);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
                                            startRestartGroup.startReplaceableGroup(-142660079);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                                            InputPhase inputPhase8 = (InputPhase) updateTransition.getCurrentState();
                                            startRestartGroup.startReplaceableGroup(-1468066062);
                                            ComposerKt.sourceInformation(startRestartGroup, str2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                                            }
                                            long j4 = WhenMappings.$EnumSwitchMapping$0[inputPhase8.ordinal()] != 1 ? j : j2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            Color m3281boximpl = Color.m3281boximpl(j4);
                                            InputPhase inputPhase9 = (InputPhase) updateTransition.getTargetState();
                                            startRestartGroup.startReplaceableGroup(-1468066062);
                                            ComposerKt.sourceInformation(startRestartGroup, str2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1468066062, 0, -1, "androidx.compose.material3.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:365)");
                                            }
                                            long j5 = WhenMappings.$EnumSwitchMapping$0[inputPhase9.ordinal()] != 1 ? j : j2;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, 229376);
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.endReplaceableGroup();
                                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
                                            int i9 = (i2 & 7168) | 384;
                                            startRestartGroup.startReplaceableGroup(-1939694975);
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                            ColorSpace m3295getColorSpaceimpl2 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i9 >> 6) & 112)).m3301unboximpl());
                                            startRestartGroup.startReplaceableGroup(1157296644);
                                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
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
                                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                                            int i12 = (i11 >> 9) & 112;
                                            State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i12)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i12)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i11 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i11 & 14) | ((i11 << 9) & 57344) | ((i11 << 6) & 458752));
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.endReplaceableGroup();
                                            content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3281boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation4)), Color.m3281boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation5)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation3)), startRestartGroup, Integer.valueOf(i2 & 458752));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }
                                    f5 = 1.0f;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    Float valueOf32 = Float.valueOf(f5);
                                    InputPhase inputPhase62 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(5829913);
                                    ComposerKt.sourceInformation(startRestartGroup, str2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase62.ordinal()];
                                    if (i7 != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$2.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
                                    startRestartGroup.startReplaceableGroup(-1939694975);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                    InputPhase inputPhase72 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1468066062);
                                    ComposerKt.sourceInformation(startRestartGroup, str2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase72.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    ColorSpace m3295getColorSpaceimpl3 = Color.m3295getColorSpaceimpl(j3);
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                    changed = startRestartGroup.changed(m3295getColorSpaceimpl3);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl3);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    startRestartGroup.endReplaceableGroup();
                                    TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue;
                                    startRestartGroup.startReplaceableGroup(-142660079);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                                    InputPhase inputPhase82 = (InputPhase) updateTransition.getCurrentState();
                                    startRestartGroup.startReplaceableGroup(-1468066062);
                                    ComposerKt.sourceInformation(startRestartGroup, str2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase82.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    Color m3281boximpl2 = Color.m3281boximpl(j4);
                                    InputPhase inputPhase92 = (InputPhase) updateTransition.getTargetState();
                                    startRestartGroup.startReplaceableGroup(-1468066062);
                                    ComposerKt.sourceInformation(startRestartGroup, str2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase92.ordinal()] != 1) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    State createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl2, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter2, "LabelTextStyleColor", startRestartGroup, 229376);
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
                                    int i92 = (i2 & 7168) | 384;
                                    startRestartGroup.startReplaceableGroup(-1939694975);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                    ColorSpace m3295getColorSpaceimpl22 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i92 >> 6) & 112)).m3301unboximpl());
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
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
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                                    int i122 = (i112 >> 9) & 112;
                                    State createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i122)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i122)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i112 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i112 & 14) | ((i112 << 9) & 57344) | ((i112 << 6) & 458752));
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.endReplaceableGroup();
                                    content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3281boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation42)), Color.m3281boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation52)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation32)), startRestartGroup, Integer.valueOf(i2 & 458752));
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }
                                f4 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$22 = TextFieldTransitionScope$Transition$prefixSuffixOpacity$2.INSTANCE;
                                startRestartGroup.startReplaceableGroup(-1338768149);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                                TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                startRestartGroup.startReplaceableGroup(-142660079);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                                InputPhase inputPhase52 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceableGroup(5829913);
                                ComposerKt.sourceInformation(startRestartGroup, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase52.ordinal()];
                                if (i6 != 1) {
                                }
                                f5 = 1.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                Float valueOf322 = Float.valueOf(f5);
                                InputPhase inputPhase622 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(5829913);
                                ComposerKt.sourceInformation(startRestartGroup, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase622.ordinal()];
                                if (i7 != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$22.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter32, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
                                startRestartGroup.startReplaceableGroup(-1939694975);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                InputPhase inputPhase722 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1468066062);
                                ComposerKt.sourceInformation(startRestartGroup, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase722.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                ColorSpace m3295getColorSpaceimpl32 = Color.m3295getColorSpaceimpl(j3);
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(m3295getColorSpaceimpl32);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl32);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceableGroup();
                                TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue;
                                startRestartGroup.startReplaceableGroup(-142660079);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                                InputPhase inputPhase822 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceableGroup(-1468066062);
                                ComposerKt.sourceInformation(startRestartGroup, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase822.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                Color m3281boximpl22 = Color.m3281boximpl(j4);
                                InputPhase inputPhase922 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceableGroup(-1468066062);
                                ComposerKt.sourceInformation(startRestartGroup, str2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (WhenMappings.$EnumSwitchMapping$0[inputPhase922.ordinal()] != 1) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                State createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl22, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter22, "LabelTextStyleColor", startRestartGroup, 229376);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$222 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
                                int i922 = (i2 & 7168) | 384;
                                startRestartGroup.startReplaceableGroup(-1939694975);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                ColorSpace m3295getColorSpaceimpl222 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i922 >> 6) & 112)).m3301unboximpl());
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
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
                                ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                                int i1222 = (i1122 >> 9) & 112;
                                State createTransitionAnimation522 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i1222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i1222)), textFieldTransitionScope$Transition$labelContentColor$222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i1122 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i1122 & 14) | ((i1122 << 9) & 57344) | ((i1122 << 6) & 458752));
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3281boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation422)), Color.m3281boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation522)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation22)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation322)), startRestartGroup, Integer.valueOf(i2 & 458752));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                            f3 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf22 = Float.valueOf(f3);
                            InputPhase inputPhase42 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(2067512179);
                            ComposerKt.sourceInformation(startRestartGroup, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase42.ordinal()];
                            if (i5 != 1) {
                            }
                            f4 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$222 = TextFieldTransitionScope$Transition$prefixSuffixOpacity$2.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-1338768149);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                            InputPhase inputPhase522 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(5829913);
                            ComposerKt.sourceInformation(startRestartGroup, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase522.ordinal()];
                            if (i6 != 1) {
                            }
                            f5 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf3222 = Float.valueOf(f5);
                            InputPhase inputPhase6222 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(5829913);
                            ComposerKt.sourceInformation(startRestartGroup, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase6222.ordinal()];
                            if (i7 != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3222, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$222.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter322, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2222 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-1939694975);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                            InputPhase inputPhase7222 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1468066062);
                            ComposerKt.sourceInformation(startRestartGroup, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase7222.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            ColorSpace m3295getColorSpaceimpl322 = Color.m3295getColorSpaceimpl(j3);
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(m3295getColorSpaceimpl322);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl322);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceableGroup();
                            TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue;
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                            InputPhase inputPhase8222 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1468066062);
                            ComposerKt.sourceInformation(startRestartGroup, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase8222.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            Color m3281boximpl222 = Color.m3281boximpl(j4);
                            InputPhase inputPhase9222 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-1468066062);
                            ComposerKt.sourceInformation(startRestartGroup, str2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase9222.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            State createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl222, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter222, "LabelTextStyleColor", startRestartGroup, 229376);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2222 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
                            int i9222 = (i2 & 7168) | 384;
                            startRestartGroup.startReplaceableGroup(-1939694975);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                            ColorSpace m3295getColorSpaceimpl2222 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i9222 >> 6) & 112)).m3301unboximpl());
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
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
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                            int i12222 = (i11222 >> 9) & 112;
                            State createTransitionAnimation5222 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i12222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i12222)), textFieldTransitionScope$Transition$labelContentColor$2222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i11222 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i11222 & 14) | ((i11222 << 9) & 57344) | ((i11222 << 6) & 458752));
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m3281boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation4222)), Color.m3281boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation5222)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation222)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation3222)), startRestartGroup, Integer.valueOf(i2 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        } else if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f2 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    String str22 = str;
                    State createTransitionAnimation6 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-1338768149);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                    InputPhase inputPhase32 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(2067512179);
                    ComposerKt.sourceInformation(startRestartGroup, str22);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase32.ordinal()];
                    if (i4 != 1) {
                    }
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf222 = Float.valueOf(f3);
                    InputPhase inputPhase422 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(2067512179);
                    ComposerKt.sourceInformation(startRestartGroup, str22);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase422.ordinal()];
                    if (i5 != 1) {
                    }
                    f4 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$22.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$2222 = TextFieldTransitionScope$Transition$prefixSuffixOpacity$2.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-1338768149);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter3222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                    InputPhase inputPhase5222 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(5829913);
                    ComposerKt.sourceInformation(startRestartGroup, str22);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase5222.ordinal()];
                    if (i6 != 1) {
                    }
                    f5 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf32222 = Float.valueOf(f5);
                    InputPhase inputPhase62222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(5829913);
                    ComposerKt.sourceInformation(startRestartGroup, str22);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase62222.ordinal()];
                    if (i7 != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation32222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf32222, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$2222.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22222 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-1939694975);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                    InputPhase inputPhase72222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1468066062);
                    ComposerKt.sourceInformation(startRestartGroup, str22);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase72222.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    ColorSpace m3295getColorSpaceimpl3222 = Color.m3295getColorSpaceimpl(j3);
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(m3295getColorSpaceimpl3222);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl3222);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    TwoWayConverter twoWayConverter2222 = (TwoWayConverter) rememberedValue;
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                    InputPhase inputPhase82222 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1468066062);
                    ComposerKt.sourceInformation(startRestartGroup, str22);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase82222.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Color m3281boximpl2222 = Color.m3281boximpl(j4);
                    InputPhase inputPhase92222 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1468066062);
                    ComposerKt.sourceInformation(startRestartGroup, str22);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase92222.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    State createTransitionAnimation42222 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl2222, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter2222, "LabelTextStyleColor", startRestartGroup, 229376);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22222 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
                    int i92222 = (i2 & 7168) | 384;
                    startRestartGroup.startReplaceableGroup(-1939694975);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                    ColorSpace m3295getColorSpaceimpl22222 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i92222 >> 6) & 112)).m3301unboximpl());
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
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
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                    int i122222 = (i112222 >> 9) & 112;
                    State createTransitionAnimation52222 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i122222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i122222)), textFieldTransitionScope$Transition$labelContentColor$22222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i112222 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i112222 & 14) | ((i112222 << 9) & 57344) | ((i112222 << 6) & 458752));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation6)), Color.m3281boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation42222)), Color.m3281boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation52222)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2222)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation32222)), startRestartGroup, Integer.valueOf(i2 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf4 = Float.valueOf(f);
            InputPhase inputPhase22 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(240378898);
            ComposerKt.sourceInformation(startRestartGroup, "C:TextFieldImpl.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            i3 = WhenMappings.$EnumSwitchMapping$0[inputPhase22.ordinal()];
            if (i3 != 1) {
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            String str222 = str;
            State createTransitionAnimation62 = TransitionKt.createTransitionAnimation(updateTransition, valueOf4, Float.valueOf(f2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
            InputPhase inputPhase322 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(2067512179);
            ComposerKt.sourceInformation(startRestartGroup, str222);
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase322.ordinal()];
            if (i4 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf2222 = Float.valueOf(f3);
            InputPhase inputPhase4222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(2067512179);
            ComposerKt.sourceInformation(startRestartGroup, str222);
            if (ComposerKt.isTraceInProgress()) {
            }
            i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase4222.ordinal()];
            if (i5 != 1) {
            }
            f4 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation22222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2222, Float.valueOf(f4), textFieldTransitionScope$Transition$placeholderOpacity$222.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$prefixSuffixOpacity$2 textFieldTransitionScope$Transition$prefixSuffixOpacity$22222 = TextFieldTransitionScope$Transition$prefixSuffixOpacity$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter32222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
            InputPhase inputPhase52222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(5829913);
            ComposerKt.sourceInformation(startRestartGroup, str222);
            if (ComposerKt.isTraceInProgress()) {
            }
            i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase52222.ordinal()];
            if (i6 != 1) {
            }
            f5 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf322222 = Float.valueOf(f5);
            InputPhase inputPhase622222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(5829913);
            ComposerKt.sourceInformation(startRestartGroup, str222);
            if (ComposerKt.isTraceInProgress()) {
            }
            i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase622222.ordinal()];
            if (i7 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation322222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf322222, Float.valueOf(f6), textFieldTransitionScope$Transition$prefixSuffixOpacity$22222.invoke((TextFieldTransitionScope$Transition$prefixSuffixOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter32222, "PrefixSuffixOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222222 = TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1939694975);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            InputPhase inputPhase722222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1468066062);
            ComposerKt.sourceInformation(startRestartGroup, str222);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase722222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            ColorSpace m3295getColorSpaceimpl32222 = Color.m3295getColorSpaceimpl(j3);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(m3295getColorSpaceimpl32222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl32222);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter22222 = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
            InputPhase inputPhase822222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1468066062);
            ComposerKt.sourceInformation(startRestartGroup, str222);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase822222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Color m3281boximpl22222 = Color.m3281boximpl(j4);
            InputPhase inputPhase922222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1468066062);
            ComposerKt.sourceInformation(startRestartGroup, str222);
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase922222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation422222 = TransitionKt.createTransitionAnimation(updateTransition, m3281boximpl22222, Color.m3281boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$222222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter22222, "LabelTextStyleColor", startRestartGroup, 229376);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$222222 = TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE;
            int i922222 = (i2 & 7168) | 384;
            startRestartGroup.startReplaceableGroup(-1939694975);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            ColorSpace m3295getColorSpaceimpl222222 = Color.m3295getColorSpaceimpl(contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i922222 >> 6) & 112)).m3301unboximpl());
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(m3295getColorSpaceimpl222222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3295getColorSpaceimpl222222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            int i1022222 = i922222 << 3;
            int i1122222 = (i1022222 & 57344) | (i922222 & 14) | 64 | (i1022222 & 896) | (i1022222 & 7168);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
            int i1222222 = (i1122222 >> 9) & 112;
            State createTransitionAnimation522222 = TransitionKt.createTransitionAnimation(updateTransition, contentColor.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i1222222)), contentColor.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i1222222)), textFieldTransitionScope$Transition$labelContentColor$222222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) Integer.valueOf((i1122222 >> 3) & 112)), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, (i1122222 & 14) | ((i1122222 << 9) & 57344) | ((i1122222 << 6) & 458752));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            content.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation62)), Color.m3281boximpl(Transition_DTcfvLk$lambda$7(createTransitionAnimation422222)), Color.m3281boximpl(Transition_DTcfvLk$lambda$8(createTransitionAnimation522222)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation22222)), Float.valueOf(Transition_DTcfvLk$lambda$5(createTransitionAnimation322222)), startRestartGroup, Integer.valueOf(i2 & 458752));
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

    private static final float Transition_DTcfvLk$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$7(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$8(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }
}
