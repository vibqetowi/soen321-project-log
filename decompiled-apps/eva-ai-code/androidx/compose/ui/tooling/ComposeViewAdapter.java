package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.unit.IntRect;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: ComposeViewAdapter.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0004\u000b\u000e\u0011\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010Q\u001a\u00020(2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)H\u0003¢\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u00020(2\u0006\u0010T\u001a\u00020UH\u0014J\r\u0010V\u001a\u00020(H\u0000¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020(H\u0002J\b\u0010Y\u001a\u00020(H\u0002J\u0006\u0010:\u001a\u00020.J\u0010\u0010Z\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u009d\u0001\u0010Z\u001a\u00020(2\u0006\u0010[\u001a\u00020\u00172\u0006\u0010\\\u001a\u00020\u00172\u0016\b\u0002\u0010]\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030_\u0018\u00010^2\b\b\u0002\u0010`\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010a\u001a\u00020b2\b\b\u0002\u00109\u001a\u00020.2\b\b\u0002\u0010;\u001a\u00020.2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010c\u001a\b\u0012\u0004\u0012\u00020(0'2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020(0'H\u0001¢\u0006\u0002\bdJ\b\u0010e\u001a\u00020(H\u0002J\b\u0010f\u001a\u00020(H\u0014J0\u0010g\u001a\u00020(2\u0006\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020\b2\u0006\u0010j\u001a\u00020\b2\u0006\u0010k\u001a\u00020\b2\u0006\u0010l\u001a\u00020\bH\u0014J\b\u0010m\u001a\u00020(H\u0002J\u000e\u0010n\u001a\u0004\u0018\u00010o*\u00020pH\u0002J\u0016\u0010q\u001a\u0004\u0018\u00010\u0017*\u00020K2\u0006\u0010r\u001a\u00020sH\u0002J\f\u0010t\u001a\u00020.*\u00020KH\u0002J\f\u0010u\u001a\u00020.*\u00020KH\u0002J\u001e\u0010v\u001a\u0004\u0018\u00010\u0017*\u00020p2\u0006\u0010w\u001a\u00020\b2\u0006\u0010x\u001a\u00020\bH\u0002J\f\u0010y\u001a\u00020.*\u00020KH\u0002J\f\u0010z\u001a\u00020G*\u00020KH\u0002R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00198\u0000@\u0000X\u0081.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010%\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)0&X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u001bR\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R \u00102\u001a\b\u0012\u0004\u0012\u00020\u001703X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010=\u001a\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)X\u0082\u000e¢\u0006\u0004\n\u0002\u0010>R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u00020.X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u0010F\u001a\b\u0012\u0004\u0012\u00020G03X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00105\"\u0004\bI\u00107R\u0018\u0010J\u001a\u00020\u0017*\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u00020\b*\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006{"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "FakeActivityResultRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1;", "FakeOnBackPressedDispatcherOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1;", "FakeSavedStateRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1;", "FakeViewModelStoreOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1;", "TAG", "", RtspHeaders.Values.CLOCK, "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "getClock$ui_tooling_release$annotations", "()V", "getClock$ui_tooling_release", "()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "setClock$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;)V", "composableName", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "composition", "Landroidx/compose/runtime/Composition;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getContent$annotations", "debugBoundsPaint", "Landroid/graphics/Paint;", "debugPaintBounds", "", "debugViewInfos", "delayedException", "Landroidx/compose/ui/tooling/ThreadSafeException;", "designInfoList", "", "getDesignInfoList$ui_tooling_release", "()Ljava/util/List;", "setDesignInfoList$ui_tooling_release", "(Ljava/util/List;)V", "designInfoProvidersArgument", "forceCompositionInvalidation", "hasAnimations", "lookForDesignInfoProviders", "onDraw", "previewComposition", "Lkotlin/jvm/functions/Function2;", "slotTableRecord", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "stitchTrees", "getStitchTrees$ui_tooling_release", "()Z", "setStitchTrees$ui_tooling_release", "(Z)V", "viewInfos", "Landroidx/compose/ui/tooling/ViewInfo;", "getViewInfos$ui_tooling_release", "setViewInfos$ui_tooling_release", "fileName", "Landroidx/compose/ui/tooling/data/Group;", "getFileName", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "lineNumber", "getLineNumber", "(Landroidx/compose/ui/tooling/data/Group;)I", "WrapPreview", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispose", "dispose$ui_tooling_release", "findAndTrackAnimations", "findDesignInfoProviders", "init", "className", "methodName", "parameterProvider", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "parameterProviderIndex", "animationClockStartTime", "", "onCommit", "init$ui_tooling_release", "invalidateComposition", "onAttachedToWindow", "onLayout", "changed", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, TtmlNode.RIGHT, "bottom", "processViewInfos", "getDesignInfoMethodOrNull", "Ljava/lang/reflect/Method;", "", "getDesignInfoOrNull", "box", "Landroidx/compose/ui/unit/IntRect;", "hasDesignInfo", "hasNullSourcePosition", "invokeGetDesignInfo", "x", "y", "isNullGroup", "toViewInfo", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposeViewAdapter extends FrameLayout {
    private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 FakeActivityResultRegistryOwner;
    private final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 FakeOnBackPressedDispatcherOwner;
    private final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 FakeSavedStateRegistryOwner;
    private final ComposeViewAdapter$FakeViewModelStoreOwner$1 FakeViewModelStoreOwner;
    private final String TAG;
    public PreviewAnimationClock clock;
    private String composableName;
    private final ComposeView composeView;
    private Composition composition;
    private final MutableState<Function2<Composer, Integer, Unit>> content;
    private final Paint debugBoundsPaint;
    private boolean debugPaintBounds;
    private boolean debugViewInfos;
    private final ThreadSafeException delayedException;
    private List<String> designInfoList;
    private String designInfoProvidersArgument;
    private boolean forceCompositionInvalidation;
    private boolean hasAnimations;
    private boolean lookForDesignInfoProviders;
    private Function0<Unit> onDraw;
    private Function2<? super Composer, ? super Integer, Unit> previewComposition;
    private final CompositionDataRecord slotTableRecord;
    private boolean stitchTrees;
    private List<ViewInfo> viewInfos;

    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }

    public final List<ViewInfo> getViewInfos$ui_tooling_release() {
        return this.viewInfos;
    }

    public final void setViewInfos$ui_tooling_release(List<ViewInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.viewInfos = list;
    }

    public final List<String> getDesignInfoList$ui_tooling_release() {
        return this.designInfoList;
    }

    public final void setDesignInfoList$ui_tooling_release(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.designInfoList = list;
    }

    public final boolean getStitchTrees$ui_tooling_release() {
        return this.stitchTrees;
    }

    public final void setStitchTrees$ui_tooling_release(boolean z) {
        this.stitchTrees = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r8v15, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attrs) {
        super(context, attrs);
        Function2 function2;
        MutableState<Function2<Composer, Integer, Unit>> mutableStateOf$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.TAG = "ComposeViewAdapter";
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.composeView = new ComposeView(context2, null, 0, 6, null);
        this.viewInfos = CollectionsKt.emptyList();
        this.designInfoList = CollectionsKt.emptyList();
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapterKt.INSTANCE.m5520getLambda2$ui_tooling_release();
        function2 = ComposeViewAdapterKt.emptyContent;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function2, null, 2, null);
        this.content = mutableStateOf$default;
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m3345toArgb8_81llA(Color.Companion.m3325getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            public LifecycleRegistry getLifecycle() {
                ComposeViewAdapter$FakeSavedStateRegistryOwner$1 composeViewAdapter$FakeSavedStateRegistryOwner$1;
                composeViewAdapter$FakeSavedStateRegistryOwner$1 = ComposeViewAdapter.this.FakeSavedStateRegistryOwner;
                return composeViewAdapter$FakeSavedStateRegistryOwner$1.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i, ActivityResultContract<I, O> contract, I i2, ActivityOptionsCompat activityOptionsCompat) {
                    Intrinsics.checkNotNullParameter(contract, "contract");
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v14, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r8v15, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Function2 function2;
        MutableState<Function2<Composer, Integer, Unit>> mutableStateOf$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.TAG = "ComposeViewAdapter";
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.composeView = new ComposeView(context2, null, 0, 6, null);
        this.viewInfos = CollectionsKt.emptyList();
        this.designInfoList = CollectionsKt.emptyList();
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapterKt.INSTANCE.m5520getLambda2$ui_tooling_release();
        function2 = ComposeViewAdapterKt.emptyContent;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function2, null, 2, null);
        this.content = mutableStateOf$default;
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m3345toArgb8_81llA(Color.Companion.m3325getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            public LifecycleRegistry getLifecycle() {
                ComposeViewAdapter$FakeSavedStateRegistryOwner$1 composeViewAdapter$FakeSavedStateRegistryOwner$1;
                composeViewAdapter$FakeSavedStateRegistryOwner$1 = ComposeViewAdapter.this.FakeSavedStateRegistryOwner;
                return composeViewAdapter$FakeSavedStateRegistryOwner$1.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i2, ActivityResultContract<I, O> contract, I i22, ActivityOptionsCompat activityOptionsCompat) {
                    Intrinsics.checkNotNullParameter(contract, "contract");
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attrs);
    }

    private final String getFileName(Group group) {
        String sourceFile;
        SourceLocation location = group.getLocation();
        return (location == null || (sourceFile = location.getSourceFile()) == null) ? "" : sourceFile;
    }

    private final int getLineNumber(Group group) {
        SourceLocation location = group.getLocation();
        if (location != null) {
            return location.getLineNumber();
        }
        return -1;
    }

    private final boolean hasNullSourcePosition(Group group) {
        return (getFileName(group).length() == 0) && getLineNumber(group) == -1;
    }

    private final boolean isNullGroup(Group group) {
        if (hasNullSourcePosition(group) && group.getChildren().isEmpty()) {
            NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
            Object node = nodeGroup != null ? nodeGroup.getNode() : null;
            if ((node instanceof LayoutInfo ? node : null) == null) {
                return true;
            }
        }
        return false;
    }

    private final ViewInfo toViewInfo(Group group) {
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? node : null;
        if (group.getChildren().size() == 1 && hasNullSourcePosition(group) && layoutInfo == null) {
            return toViewInfo((Group) CollectionsKt.single(group.getChildren()));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : group.getChildren()) {
            if (!isNullGroup((Group) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList<Group> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (Group group2 : arrayList2) {
            arrayList3.add(toViewInfo(group2));
        }
        ArrayList arrayList4 = arrayList3;
        SourceLocation location = group.getLocation();
        String str = (location == null || (r1 = location.getSourceFile()) == null) ? "" : "";
        SourceLocation location2 = group.getLocation();
        return new ViewInfo(str, location2 != null ? location2.getLineNumber() : -1, group.getBox(), group.getLocation(), arrayList4, layoutInfo);
    }

    private final void processViewInfos() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        for (CompositionData compositionData : store) {
            arrayList.add(toViewInfo(SlotTreeKt.asTree(compositionData)));
        }
        List<ViewInfo> list = CollectionsKt.toList(arrayList);
        if (this.stitchTrees) {
            list = ShadowViewInfoKt.stitchTrees(list);
        }
        this.viewInfos = list;
        if (this.debugViewInfos) {
            Log.d(this.TAG, ViewInfoUtilKt.toDebugString$default(list, 0, null, 3, null));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.delayedException.throwIfPresent();
        processViewInfos();
        if (this.composableName.length() > 0) {
            findAndTrackAnimations();
            if (this.lookForDesignInfoProviders) {
                findDesignInfoProviders();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View rootView = this.composeView.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "composeView.rootView");
        ViewTreeLifecycleOwner.set(rootView, this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    private final void findAndTrackAnimations() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        for (CompositionData compositionData : store) {
            arrayList.add(SlotTreeKt.asTree(compositionData));
        }
        AnimationSearch animationSearch = new AnimationSearch(new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackAnimations$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ComposeViewAdapter) this.receiver).getClock$ui_tooling_release();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((ComposeViewAdapter) this.receiver).setClock$ui_tooling_release((PreviewAnimationClock) obj);
            }
        }, new ComposeViewAdapter$findAndTrackAnimations$2(this));
        animationSearch.findAll(arrayList);
        this.hasAnimations = animationSearch.getHasAnimations();
        if (this.clock != null) {
            animationSearch.trackAll();
        }
    }

    private final void findDesignInfoProviders() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList<Group> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        for (CompositionData compositionData : store) {
            arrayList.add(SlotTreeKt.asTree(compositionData));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Group group : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            for (Group group2 : PreviewUtilsKt.findAll(group, new ComposeViewAdapter$findDesignInfoProviders$1$1(this))) {
                String designInfoOrNull = getDesignInfoOrNull(group2, group2.getBox());
                if (designInfoOrNull == null) {
                    Iterator<T> it = group2.getChildren().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            designInfoOrNull = null;
                            break;
                        }
                        String designInfoOrNull2 = getDesignInfoOrNull((Group) it.next(), group2.getBox());
                        if (designInfoOrNull2 != null) {
                            designInfoOrNull = designInfoOrNull2;
                            break;
                        }
                    }
                }
                if (designInfoOrNull != null) {
                    arrayList3.add(designInfoOrNull);
                }
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        this.designInfoList = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasDesignInfo(Group group) {
        boolean z;
        Collection<Object> data = group.getData();
        if ((data instanceof Collection) && data.isEmpty()) {
            return false;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next != null ? getDesignInfoMethodOrNull(next) : null) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final String getDesignInfoOrNull(Group group, IntRect intRect) {
        String str;
        Iterator<T> it = group.getData().iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                str = invokeGetDesignInfo(next, intRect.getLeft(), intRect.getRight());
                continue;
            }
        } while (str == null);
        return str;
    }

    private final Method getDesignInfoMethodOrNull(Object obj) {
        try {
            return obj.getClass().getDeclaredMethod("getDesignInfo", Integer.TYPE, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String invokeGetDesignInfo(Object obj, int i, int i2) {
        Method designInfoMethodOrNull = getDesignInfoMethodOrNull(obj);
        if (designInfoMethodOrNull != null) {
            try {
                Object invoke = designInfoMethodOrNull.invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), this.designInfoProvidersArgument);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
                String str = (String) invoke;
                if (str.length() == 0) {
                    str = null;
                }
                return str;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void invalidateComposition() {
        this.content.setValue(ComposableSingletons$ComposeViewAdapterKt.INSTANCE.m5521getLambda3$ui_tooling_release());
        this.content.setValue(this.previewComposition);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.forceCompositionInvalidation) {
            invalidateComposition();
        }
        this.onDraw.invoke();
        if (this.debugPaintBounds) {
            ArrayList<ViewInfo> arrayList = new ArrayList();
            for (ViewInfo viewInfo : this.viewInfos) {
                CollectionsKt.addAll(arrayList, CollectionsKt.plus((Collection) CollectionsKt.listOf(viewInfo), (Iterable) viewInfo.allChildren()));
            }
            for (ViewInfo viewInfo2 : arrayList) {
                if (viewInfo2.hasBounds()) {
                    canvas.drawRect(new Rect(viewInfo2.getBounds().getLeft(), viewInfo2.getBounds().getTop(), viewInfo2.getBounds().getRight(), viewInfo2.getBounds().getBottom()), this.debugBoundsPaint);
                }
            }
        }
    }

    public final PreviewAnimationClock getClock$ui_tooling_release() {
        PreviewAnimationClock previewAnimationClock = this.clock;
        if (previewAnimationClock != null) {
            return previewAnimationClock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(RtspHeaders.Values.CLOCK);
        return null;
    }

    public final void setClock$ui_tooling_release(PreviewAnimationClock previewAnimationClock) {
        Intrinsics.checkNotNullParameter(previewAnimationClock, "<set-?>");
        this.clock = previewAnimationClock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void WrapPreview(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(493526445);
        ComposerKt.sourceInformation(startRestartGroup, "C(WrapPreview)442@16065L428:ComposeViewAdapter.kt#hevd2p");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(493526445, i, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.kt:437)");
        }
        ProvidableCompositionLocal<Font.ResourceLoader> localFontLoader = CompositionLocalsKt.getLocalFontLoader();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{localFontLoader.provides(new LayoutlibFontResourceLoader(context)), localFontFamilyResolver.provides(FontFamilyResolver_androidKt.createFontFamilyResolver(context2)), LocalOnBackPressedDispatcherOwner.INSTANCE.provides(this.FakeOnBackPressedDispatcherOwner), LocalActivityResultRegistryOwner.INSTANCE.provides(this.FakeActivityResultRegistryOwner)}, ComposableLambdaKt.composableLambda(startRestartGroup, -1966112531, true, new ComposeViewAdapter$WrapPreview$1(this, function2, i)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ComposeViewAdapter$WrapPreview$2(this, function2, i));
    }

    public static /* synthetic */ void init$ui_tooling_release$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, int i, boolean z, boolean z2, long j, boolean z3, boolean z4, String str3, Function0 function0, Function0 function02, int i2, Object obj) {
        composeViewAdapter.init$ui_tooling_release(str, str2, (i2 & 4) != 0 ? null : cls, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? -1L : j, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? ComposeViewAdapter$init$1.INSTANCE : function0, (i2 & 2048) != 0 ? ComposeViewAdapter$init$2.INSTANCE : function02);
    }

    public final void init$ui_tooling_release(String className, String methodName, Class<? extends PreviewParameterProvider<?>> cls, int i, boolean z, boolean z2, long j, boolean z3, boolean z4, String str, Function0<Unit> onCommit, Function0<Unit> onDraw) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(onCommit, "onCommit");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.debugPaintBounds = z;
        this.debugViewInfos = z2;
        this.composableName = methodName;
        this.forceCompositionInvalidation = z3;
        this.lookForDesignInfoProviders = z4;
        this.designInfoProvidersArgument = str == null ? "" : str;
        this.onDraw = onDraw;
        ComposableLambda composableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-1704541905, true, new ComposeViewAdapter$init$3(onCommit, this, j, className, methodName, cls, i));
        this.previewComposition = composableLambdaInstance;
        this.composeView.setContent(composableLambdaInstance);
        invalidate();
    }

    public final void dispose$ui_tooling_release() {
        this.composeView.disposeComposition();
        if (this.clock != null) {
            getClock$ui_tooling_release().dispose();
        }
        this.FakeSavedStateRegistryOwner.getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        this.FakeViewModelStoreOwner.getViewModelStore().clear();
    }

    public final boolean hasAnimations() {
        return this.hasAnimations;
    }

    private final void init(AttributeSet attributeSet) {
        long j;
        ComposeViewAdapter composeViewAdapter = this;
        ViewTreeLifecycleOwner.set(composeViewAdapter, this.FakeSavedStateRegistryOwner);
        ViewTreeSavedStateRegistryOwner.set(composeViewAdapter, this.FakeSavedStateRegistryOwner);
        ViewTreeViewModelStoreOwner.set(composeViewAdapter, this.FakeViewModelStoreOwner);
        addView(this.composeView);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        String substringBeforeLast$default = StringsKt.substringBeforeLast$default(attributeValue, (char) ClassUtils.PACKAGE_SEPARATOR_CHAR, (String) null, 2, (Object) null);
        String substringAfterLast$default = StringsKt.substringAfterLast$default(attributeValue, (char) ClassUtils.PACKAGE_SEPARATOR_CHAR, (String) null, 2, (Object) null);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass = attributeValue2 != null ? PreviewUtilsKt.asPreviewProviderClass(attributeValue2) : null;
        try {
            String attributeValue3 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime");
            Intrinsics.checkNotNullExpressionValue(attributeValue3, "attrs.getAttributeValue(…animationClockStartTime\")");
            j = Long.parseLong(attributeValue3);
        } catch (Exception unused) {
            j = -1;
        }
        init$ui_tooling_release$default(this, substringBeforeLast$default, substringAfterLast$default, asPreviewProviderClass, attributeIntValue, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds), attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos), j, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "forceCompositionInvalidation", false), attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders), attributeSet.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, null);
    }
}
