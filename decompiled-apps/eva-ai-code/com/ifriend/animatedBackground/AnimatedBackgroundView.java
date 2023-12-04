package com.ifriend.animatedBackground;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import com.ifriend.animatedBackground.droplet.DropletBackgroundView;
import com.ifriend.animatedBackground.droplet.DropletState;
import com.ifriend.animatedBackground.droplet.ModifiedState;
import com.ifriend.animatedBackground.video.VideoBackgroundView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: AnimatedBackgroundView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\f\u0010\u0014\u001a\u00020\u0010*\u00020\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ifriend/animatedBackground/AnimatedBackgroundView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lastState", "Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State;", "videoBackgroundView", "Lcom/ifriend/animatedBackground/video/VideoBackgroundView;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "postState", "", "state", "updateState", "previousState", "removeAnimatedBackgroundViews", "Landroid/view/ViewGroup;", "State", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedBackgroundView extends FrameLayout {
    private State lastState;
    private VideoBackgroundView videoBackgroundView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedBackgroundView(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AnimatedBackgroundView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.inflate(context, R.layout.view_animated_background, this);
        setBackground(ContextCompat.getDrawable(context, com.ifriend.ui.R.drawable.background_app_gradient));
        this.lastState = State.Idle.INSTANCE;
    }

    public final void postState(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        updateState(state, this.lastState);
        this.lastState = state;
    }

    private final void updateState(State state, State state2) {
        View view;
        if (state instanceof State.Idle) {
            removeAnimatedBackgroundViews(this);
        } else if (state instanceof State.Droplet) {
            if (!(state2 instanceof State.Droplet)) {
                removeAnimatedBackgroundViews(this);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                DropletBackgroundView dropletBackgroundView = new DropletBackgroundView(context, null, 2, null);
                dropletBackgroundView.getDropletState().setValue(new ModifiedState(((State.Droplet) state).isVisible()));
                addView(dropletBackgroundView, 0);
                return;
            }
            Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
            while (true) {
                if (!it.hasNext()) {
                    view = null;
                    break;
                }
                view = it.next();
                if (view instanceof DropletBackgroundView) {
                    break;
                }
            }
            DropletBackgroundView dropletBackgroundView2 = view instanceof DropletBackgroundView ? (DropletBackgroundView) view : null;
            MutableStateFlow<DropletState> dropletState = dropletBackgroundView2 != null ? dropletBackgroundView2.getDropletState() : null;
            if (dropletState == null) {
                return;
            }
            dropletState.setValue(new ModifiedState(((State.Droplet) state).isVisible()));
        } else if (state instanceof State.Video) {
            if (!(state2 instanceof State.Video)) {
                removeAnimatedBackgroundViews(this);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                VideoBackgroundView videoBackgroundView = new VideoBackgroundView(context2, null, 0, 6, null);
                this.videoBackgroundView = videoBackgroundView;
                addView(videoBackgroundView, 0);
            }
            VideoBackgroundView videoBackgroundView2 = this.videoBackgroundView;
            if (videoBackgroundView2 != null) {
                State.Video video = (State.Video) state;
                videoBackgroundView2.play(video.getUri(), video.getShouldLoop());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        View view = (View) SequencesKt.first(ViewGroupKt.getChildren(this));
        if (view instanceof DropletBackgroundView) {
            ((DropletBackgroundView) view).touchEvent(ev);
        }
        return super.dispatchTouchEvent(ev);
    }

    private final void removeAnimatedBackgroundViews(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            if (viewGroup.getChildAt(childCount) instanceof BaseAnimatedBackgroundView) {
                viewGroup.removeViewAt(childCount);
            }
        }
    }

    /* compiled from: AnimatedBackgroundView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State;", "", "Droplet", "Idle", "Video", "Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State$Droplet;", "Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State$Idle;", "Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State$Video;", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface State {

        /* compiled from: AnimatedBackgroundView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State$Idle;", "Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State;", "()V", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Idle implements State {
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }
        }

        /* compiled from: AnimatedBackgroundView.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State$Droplet;", "Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State;", "isVisible", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Droplet implements State {
            private final boolean isVisible;

            public static /* synthetic */ Droplet copy$default(Droplet droplet, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = droplet.isVisible;
                }
                return droplet.copy(z);
            }

            public final boolean component1() {
                return this.isVisible;
            }

            public final Droplet copy(boolean z) {
                return new Droplet(z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Droplet) && this.isVisible == ((Droplet) obj).isVisible;
            }

            public int hashCode() {
                boolean z = this.isVisible;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                boolean z = this.isVisible;
                return "Droplet(isVisible=" + z + ")";
            }

            public Droplet(boolean z) {
                this.isVisible = z;
            }

            public final boolean isVisible() {
                return this.isVisible;
            }
        }

        /* compiled from: AnimatedBackgroundView.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State$Video;", "Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State;", "uri", "Landroid/net/Uri;", "shouldLoop", "", "(Landroid/net/Uri;Z)V", "getShouldLoop", "()Z", "getUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "animated_background_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Video implements State {
            private final boolean shouldLoop;
            private final Uri uri;

            public static /* synthetic */ Video copy$default(Video video, Uri uri, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = video.uri;
                }
                if ((i & 2) != 0) {
                    z = video.shouldLoop;
                }
                return video.copy(uri, z);
            }

            public final Uri component1() {
                return this.uri;
            }

            public final boolean component2() {
                return this.shouldLoop;
            }

            public final Video copy(Uri uri, boolean z) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                return new Video(uri, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Video) {
                    Video video = (Video) obj;
                    return Intrinsics.areEqual(this.uri, video.uri) && this.shouldLoop == video.shouldLoop;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.uri.hashCode() * 31;
                boolean z = this.shouldLoop;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public String toString() {
                Uri uri = this.uri;
                boolean z = this.shouldLoop;
                return "Video(uri=" + uri + ", shouldLoop=" + z + ")";
            }

            public Video(Uri uri, boolean z) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                this.uri = uri;
                this.shouldLoop = z;
            }

            public final Uri getUri() {
                return this.uri;
            }

            public final boolean getShouldLoop() {
                return this.shouldLoop;
            }
        }
    }
}
