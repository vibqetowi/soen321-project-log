package coil.transition;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil.decode.DataSource;
import coil.drawable.CrossfadeDrawable;
import coil.request.ErrorResult;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.size.Scale;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CrossfadeTransition.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcoil/transition/CrossfadeTransition;", "Lcoil/transition/Transition;", TypedValues.AttributesType.S_TARGET, "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "durationMillis", "", "preferExactIntrinsicSize", "", "(Lcoil/transition/TransitionTarget;Lcoil/request/ImageResult;IZ)V", "getDurationMillis", "()I", "getPreferExactIntrinsicSize", "()Z", "transition", "", "Factory", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CrossfadeTransition implements Transition {
    private final int durationMillis;
    private final boolean preferExactIntrinsicSize;
    private final ImageResult result;
    private final TransitionTarget target;

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult) {
        this(transitionTarget, imageResult, 0, false, 12, null);
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i) {
        this(transitionTarget, imageResult, i, false, 8, null);
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i, boolean z) {
        this.target = transitionTarget;
        this.result = imageResult;
        this.durationMillis = i;
        this.preferExactIntrinsicSize = z;
        if (!(i > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    public /* synthetic */ CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(transitionTarget, imageResult, (i2 & 4) != 0 ? 100 : i, (i2 & 8) != 0 ? false : z);
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    @Override // coil.transition.Transition
    public void transition() {
        Drawable drawable = this.target.getDrawable();
        Drawable drawable2 = this.result.getDrawable();
        Scale scale = this.result.getRequest().getScale();
        int i = this.durationMillis;
        ImageResult imageResult = this.result;
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawable, drawable2, scale, i, ((imageResult instanceof SuccessResult) && ((SuccessResult) imageResult).isPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        ImageResult imageResult2 = this.result;
        if (imageResult2 instanceof SuccessResult) {
            this.target.onSuccess(crossfadeDrawable);
        } else if (imageResult2 instanceof ErrorResult) {
            this.target.onError(crossfadeDrawable);
        }
    }

    /* compiled from: CrossfadeTransition.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcoil/transition/CrossfadeTransition$Factory;", "Lcoil/transition/Transition$Factory;", "durationMillis", "", "preferExactIntrinsicSize", "", "(IZ)V", "getDurationMillis", "()I", "getPreferExactIntrinsicSize", "()Z", "create", "Lcoil/transition/Transition;", TypedValues.AttributesType.S_TARGET, "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "equals", "other", "", "hashCode", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Factory implements Transition.Factory {
        private final int durationMillis;
        private final boolean preferExactIntrinsicSize;

        public Factory() {
            this(0, false, 3, null);
        }

        public Factory(int i) {
            this(i, false, 2, null);
        }

        public Factory(int i, boolean z) {
            this.durationMillis = i;
            this.preferExactIntrinsicSize = z;
            if (!(i > 0)) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        public /* synthetic */ Factory(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? false : z);
        }

        public final int getDurationMillis() {
            return this.durationMillis;
        }

        public final boolean getPreferExactIntrinsicSize() {
            return this.preferExactIntrinsicSize;
        }

        @Override // coil.transition.Transition.Factory
        public Transition create(TransitionTarget transitionTarget, ImageResult imageResult) {
            if (!(imageResult instanceof SuccessResult)) {
                return Transition.Factory.NONE.create(transitionTarget, imageResult);
            }
            if (((SuccessResult) imageResult).getDataSource() == DataSource.MEMORY_CACHE) {
                return Transition.Factory.NONE.create(transitionTarget, imageResult);
            }
            return new CrossfadeTransition(transitionTarget, imageResult, this.durationMillis, this.preferExactIntrinsicSize);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Factory) {
                Factory factory = (Factory) obj;
                if (this.durationMillis == factory.durationMillis && this.preferExactIntrinsicSize == factory.preferExactIntrinsicSize) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.durationMillis * 31) + UByte$$ExternalSyntheticBackport0.m(this.preferExactIntrinsicSize);
        }
    }
}
