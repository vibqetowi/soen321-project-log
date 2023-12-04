package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Registry;
import androidx.constraintlayout.core.state.RegistryCallback;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\t\b!\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0003J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0015\u001a\u00020\bJ\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0004J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\nH\u0004J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\nH\u0004J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nJ\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0014J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010(\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010\u0003J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0003H\u0016J\u0014\u0010,\u001a\u00020\u001b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\u0012J\b\u0010.\u001a\u00020\u001bH\u0004R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", FirebaseAnalytics.Param.CONTENT, "", "(Ljava/lang/String;)V", "currentContent", "debugName", "forcedDrawDebug", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "forcedHeight", "", "forcedWidth", "last", "", "layoutInformation", "layoutInformationMode", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "updateFlag", "Landroidx/compose/runtime/MutableState;", "getCurrentContent", "getDebugName", "getForcedDrawDebug", "getForcedHeight", "getForcedWidth", "getLayoutInformation", "getLayoutInformationMode", "initialization", "", "onDrawDebug", "debugMode", "onLayoutInformation", RtspHeaders.Values.MODE, "onNewContent", "onNewDimensions", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "onNewProgress", "progress", "", "setCurrentContent", "setDebugName", "name", "setLayoutInformation", TtmlNode.TAG_INFORMATION, "setUpdateFlag", "needsUpdate", "signalUpdate", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EditableJSONLayout implements LayoutInformationReceiver {
    private String currentContent;
    private String debugName;
    private MotionLayoutDebugFlags forcedDrawDebug;
    private int forcedHeight;
    private int forcedWidth;
    private long last;
    private String layoutInformation;
    private LayoutInfoFlags layoutInformationMode;
    private MutableState<Long> updateFlag;

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNewProgress(float f) {
    }

    public EditableJSONLayout(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.forcedWidth = Integer.MIN_VALUE;
        this.forcedHeight = Integer.MIN_VALUE;
        this.forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
        this.layoutInformationMode = LayoutInfoFlags.NONE;
        this.layoutInformation = "";
        this.last = System.nanoTime();
        this.currentContent = content;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void initialization() {
        try {
            onNewContent(this.currentContent);
            if (this.debugName != null) {
                Registry.getInstance().register(this.debugName, new RegistryCallback() { // from class: androidx.constraintlayout.compose.EditableJSONLayout$initialization$callback$1
                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onNewMotionScene(String str) {
                        if (str == null) {
                            return;
                        }
                        EditableJSONLayout.this.onNewContent(str);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onProgress(float f) {
                        EditableJSONLayout.this.onNewProgress(f);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onDimensions(int i, int i2) {
                        EditableJSONLayout.this.onNewDimensions(i, i2);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public String currentMotionScene() {
                        String str;
                        str = EditableJSONLayout.this.currentContent;
                        return str;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public String currentLayoutInformation() {
                        String str;
                        str = EditableJSONLayout.this.layoutInformation;
                        return str;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setLayoutInformationMode(int i) {
                        EditableJSONLayout.this.onLayoutInformation(i);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public long getLastModified() {
                        long j;
                        j = EditableJSONLayout.this.last;
                        return j;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setDrawDebug(int i) {
                        EditableJSONLayout.this.onDrawDebug(i);
                    }
                });
            }
        } catch (CLParsingException unused) {
        }
    }

    public final void setUpdateFlag(MutableState<Long> needsUpdate) {
        Intrinsics.checkNotNullParameter(needsUpdate, "needsUpdate");
        this.updateFlag = needsUpdate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void signalUpdate() {
        MutableState<Long> mutableState = this.updateFlag;
        if (mutableState != null) {
            Intrinsics.checkNotNull(mutableState);
            MutableState<Long> mutableState2 = this.updateFlag;
            Intrinsics.checkNotNull(mutableState2);
            mutableState.setValue(Long.valueOf(mutableState2.getValue().longValue() + 1));
        }
    }

    public final void setCurrentContent(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        onNewContent(content);
    }

    public final String getCurrentContent() {
        return this.currentContent;
    }

    public final void setDebugName(String str) {
        this.debugName = str;
    }

    public final String getDebugName() {
        return this.debugName;
    }

    public final MotionLayoutDebugFlags getForcedDrawDebug() {
        return this.forcedDrawDebug;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedWidth() {
        return this.forcedWidth;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedHeight() {
        return this.forcedHeight;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setLayoutInformation(String information) {
        Intrinsics.checkNotNullParameter(information, "information");
        this.last = System.nanoTime();
        this.layoutInformation = information;
    }

    public final String getLayoutInformation() {
        return this.layoutInformation;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public LayoutInfoFlags getLayoutInformationMode() {
        return this.layoutInformationMode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNewContent(String content) {
        CLObject objectOrNull;
        Intrinsics.checkNotNullParameter(content, "content");
        this.currentContent = content;
        try {
            CLObject parse = CLParser.parse(content);
            if (parse != null) {
                boolean z = this.debugName == null;
                if (z && (objectOrNull = parse.getObjectOrNull("Header")) != null) {
                    this.debugName = objectOrNull.getStringOrNull("exportAs");
                }
                if (z) {
                    return;
                }
                signalUpdate();
            }
        } catch (CLParsingException | Exception unused) {
        }
    }

    public final void onNewDimensions(int i, int i2) {
        this.forcedWidth = i;
        this.forcedHeight = i2;
        signalUpdate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onLayoutInformation(int i) {
        if (i == LayoutInfoFlags.NONE.ordinal()) {
            this.layoutInformationMode = LayoutInfoFlags.NONE;
        } else if (i == LayoutInfoFlags.BOUNDS.ordinal()) {
            this.layoutInformationMode = LayoutInfoFlags.BOUNDS;
        }
        signalUpdate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onDrawDebug(int i) {
        if (i == -1) {
            this.forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
        } else if (i == MotionLayoutDebugFlags.UNKNOWN.ordinal()) {
            this.forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
        } else if (i == MotionLayoutDebugFlags.NONE.ordinal()) {
            this.forcedDrawDebug = MotionLayoutDebugFlags.NONE;
        } else if (i == MotionLayoutDebugFlags.SHOW_ALL.ordinal()) {
            this.forcedDrawDebug = MotionLayoutDebugFlags.SHOW_ALL;
        }
        signalUpdate();
    }
}
