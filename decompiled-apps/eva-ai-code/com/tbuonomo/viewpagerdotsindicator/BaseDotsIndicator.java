package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tbuonomo.viewpagerdotsindicator.attacher.ViewPager2Attacher;
import com.tbuonomo.viewpagerdotsindicator.attacher.ViewPagerAttacher;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BaseDotsIndicator.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 T2\u00020\u0001:\u0003TUVB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0007H&J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u00020\u0007H\u0004J\u000e\u00104\u001a\u0002002\u0006\u00105\u001a\u000206J\u000e\u00104\u001a\u0002002\u0006\u00107\u001a\u000208J\b\u00109\u001a\u00020:H&J\u0010\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0007H\u0004J\u0010\u0010=\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u001aH\u0004J\b\u0010>\u001a\u000200H\u0014J0\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0007H\u0014J\u0012\u0010E\u001a\u0002002\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J\u0010\u0010H\u001a\u0002002\u0006\u00101\u001a\u00020\u0007H&J\u0006\u0010I\u001a\u000200J\b\u0010J\u001a\u000200H\u0004J\b\u0010K\u001a\u000200H\u0002J\b\u0010L\u001a\u000200H\u0002J\b\u0010M\u001a\u000200H\u0002J\b\u0010N\u001a\u000200H&J\u0010\u0010O\u001a\u0002002\u0006\u00103\u001a\u00020\u0007H\u0002J\u0010\u0010P\u001a\u0002002\u0006\u0010Q\u001a\u00020\u0007H\u0007J\u0010\u0010R\u001a\u0002002\u0006\u00105\u001a\u000206H\u0007J\u0010\u0010S\u001a\u0002002\u0006\u00107\u001a\u000208H\u0007R \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001aX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0012\u0010+\u001a\u00020,X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006W"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dots", "Ljava/util/ArrayList;", "Landroid/widget/ImageView;", "Lkotlin/collections/ArrayList;", "dotsClickable", "", "getDotsClickable", "()Z", "setDotsClickable", "(Z)V", "value", "dotsColor", "getDotsColor", "()I", "setDotsColor", "(I)V", "dotsCornerRadius", "", "getDotsCornerRadius", "()F", "setDotsCornerRadius", "(F)V", "dotsSize", "getDotsSize", "setDotsSize", "dotsSpacing", "getDotsSpacing", "setDotsSpacing", "pager", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "getPager", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "setPager", "(Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;)V", "type", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "getType", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "addDot", "", FirebaseAnalytics.Param.INDEX, "addDots", "count", "attachTo", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "viewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "buildOnPageChangedListener", "Lcom/tbuonomo/viewpagerdotsindicator/OnPageChangeListenerHelper;", "dpToPx", "dp", "dpToPxF", "onAttachedToWindow", "onLayout", "changed", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, TtmlNode.RIGHT, "bottom", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "refreshDotColor", "refreshDots", "refreshDotsColors", "refreshDotsCount", "refreshDotsSize", "refreshOnPageChangedListener", "removeDot", "removeDots", "setPointsColor", "color", "setViewPager", "setViewPager2", "Companion", "Pager", "Type", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseDotsIndicator extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_POINT_COLOR = -16711681;
    protected final ArrayList<ImageView> dots;
    private boolean dotsClickable;
    private int dotsColor;
    private float dotsCornerRadius;
    private float dotsSize;
    private float dotsSpacing;
    private Pager pager;

    /* compiled from: BaseDotsIndicator.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\rH&J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Pager;", "", "count", "", "getCount", "()I", "currentItem", "getCurrentItem", "isEmpty", "", "()Z", "isNotEmpty", "addOnPageChangeListener", "", "onPageChangeListenerHelper", "Lcom/tbuonomo/viewpagerdotsindicator/OnPageChangeListenerHelper;", "removeOnPageChangeListener", "setCurrentItem", "item", "smoothScroll", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface Pager {
        void addOnPageChangeListener(OnPageChangeListenerHelper onPageChangeListenerHelper);

        int getCount();

        int getCurrentItem();

        boolean isEmpty();

        boolean isNotEmpty();

        void removeOnPageChangeListener();

        void setCurrentItem(int i, boolean z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDotsIndicator(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseDotsIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract void addDot(int i);

    public abstract OnPageChangeListenerHelper buildOnPageChangedListener();

    public abstract Type getType();

    public abstract void refreshDotColor(int i);

    public abstract void removeDot();

    public /* synthetic */ BaseDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dots = new ArrayList<>();
        this.dotsClickable = true;
        this.dotsColor = DEFAULT_POINT_COLOR;
        float dpToPxF = dpToPxF(getType().getDefaultSize());
        this.dotsSize = dpToPxF;
        this.dotsCornerRadius = dpToPxF / 2.0f;
        this.dotsSpacing = dpToPxF(getType().getDefaultSpacing());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getType().getStyleableId());
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…(attrs, type.styleableId)");
            setDotsColor(obtainStyledAttributes.getColor(getType().getDotsColorId(), DEFAULT_POINT_COLOR));
            this.dotsSize = obtainStyledAttributes.getDimension(getType().getDotsSizeId(), this.dotsSize);
            this.dotsCornerRadius = obtainStyledAttributes.getDimension(getType().getDotsCornerRadiusId(), this.dotsCornerRadius);
            this.dotsSpacing = obtainStyledAttributes.getDimension(getType().getDotsSpacingId(), this.dotsSpacing);
            this.dotsClickable = obtainStyledAttributes.getBoolean(getType().getDotsClickableId(), true);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: BaseDotsIndicator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Companion;", "", "()V", "DEFAULT_POINT_COLOR", "", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DEFAULT uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: BaseDotsIndicator.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BS\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "", "defaultSize", "", "defaultSpacing", "styleableId", "", "dotsColorId", "", "dotsSizeId", "dotsSpacingId", "dotsCornerRadiusId", "dotsClickableId", "(Ljava/lang/String;IFF[IIIIII)V", "getDefaultSize", "()F", "getDefaultSpacing", "getDotsClickableId", "()I", "getDotsColorId", "getDotsCornerRadiusId", "getDotsSizeId", "getDotsSpacingId", "getStyleableId", "()[I", "DEFAULT", "SPRING", "WORM", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type DEFAULT;
        public static final Type SPRING;
        public static final Type WORM;
        private final float defaultSize;
        private final float defaultSpacing;
        private final int dotsClickableId;
        private final int dotsColorId;
        private final int dotsCornerRadiusId;
        private final int dotsSizeId;
        private final int dotsSpacingId;
        private final int[] styleableId;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEFAULT, SPRING, WORM};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        private Type(String str, int i, float f, float f2, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
            this.defaultSize = f;
            this.defaultSpacing = f2;
            this.styleableId = iArr;
            this.dotsColorId = i2;
            this.dotsSizeId = i3;
            this.dotsSpacingId = i4;
            this.dotsCornerRadiusId = i5;
            this.dotsClickableId = i6;
        }

        public final float getDefaultSize() {
            return this.defaultSize;
        }

        public final float getDefaultSpacing() {
            return this.defaultSpacing;
        }

        public final int[] getStyleableId() {
            return this.styleableId;
        }

        public final int getDotsColorId() {
            return this.dotsColorId;
        }

        public final int getDotsSizeId() {
            return this.dotsSizeId;
        }

        public final int getDotsSpacingId() {
            return this.dotsSpacingId;
        }

        public final int getDotsCornerRadiusId() {
            return this.dotsCornerRadiusId;
        }

        public final int getDotsClickableId() {
            return this.dotsClickableId;
        }

        static {
            int[] SpringDotsIndicator = R.styleable.SpringDotsIndicator;
            Intrinsics.checkNotNullExpressionValue(SpringDotsIndicator, "SpringDotsIndicator");
            DEFAULT = new Type("DEFAULT", 0, 16.0f, 8.0f, SpringDotsIndicator, R.styleable.SpringDotsIndicator_dotsColor, R.styleable.SpringDotsIndicator_dotsSize, R.styleable.SpringDotsIndicator_dotsSpacing, R.styleable.SpringDotsIndicator_dotsCornerRadius, R.styleable.SpringDotsIndicator_dotsClickable);
            int[] DotsIndicator = R.styleable.DotsIndicator;
            Intrinsics.checkNotNullExpressionValue(DotsIndicator, "DotsIndicator");
            SPRING = new Type("SPRING", 1, 16.0f, 4.0f, DotsIndicator, R.styleable.DotsIndicator_dotsColor, R.styleable.DotsIndicator_dotsSize, R.styleable.DotsIndicator_dotsSpacing, R.styleable.DotsIndicator_dotsCornerRadius, R.styleable.SpringDotsIndicator_dotsClickable);
            int[] WormDotsIndicator = R.styleable.WormDotsIndicator;
            Intrinsics.checkNotNullExpressionValue(WormDotsIndicator, "WormDotsIndicator");
            WORM = new Type("WORM", 2, 16.0f, 4.0f, WormDotsIndicator, R.styleable.WormDotsIndicator_dotsColor, R.styleable.WormDotsIndicator_dotsSize, R.styleable.WormDotsIndicator_dotsSpacing, R.styleable.WormDotsIndicator_dotsCornerRadius, R.styleable.SpringDotsIndicator_dotsClickable);
            $VALUES = $values();
        }
    }

    public final boolean getDotsClickable() {
        return this.dotsClickable;
    }

    public final void setDotsClickable(boolean z) {
        this.dotsClickable = z;
    }

    public final int getDotsColor() {
        return this.dotsColor;
    }

    public final void setDotsColor(int i) {
        this.dotsColor = i;
        refreshDotsColors();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float getDotsSize() {
        return this.dotsSize;
    }

    protected final void setDotsSize(float f) {
        this.dotsSize = f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float getDotsCornerRadius() {
        return this.dotsCornerRadius;
    }

    protected final void setDotsCornerRadius(float f) {
        this.dotsCornerRadius = f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float getDotsSpacing() {
        return this.dotsSpacing;
    }

    protected final void setDotsSpacing(float f) {
        this.dotsSpacing = f;
    }

    public final Pager getPager() {
        return this.pager;
    }

    public final void setPager(Pager pager) {
        this.pager = pager;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Runnable() { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BaseDotsIndicator.m7197onAttachedToWindow$lambda0(BaseDotsIndicator.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAttachedToWindow$lambda-0  reason: not valid java name */
    public static final void m7197onAttachedToWindow$lambda0(BaseDotsIndicator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshDots();
    }

    private final void refreshDotsCount() {
        int size = this.dots.size();
        Pager pager = this.pager;
        Intrinsics.checkNotNull(pager);
        if (size < pager.getCount()) {
            Pager pager2 = this.pager;
            Intrinsics.checkNotNull(pager2);
            addDots(pager2.getCount() - this.dots.size());
            return;
        }
        int size2 = this.dots.size();
        Pager pager3 = this.pager;
        Intrinsics.checkNotNull(pager3);
        if (size2 > pager3.getCount()) {
            int size3 = this.dots.size();
            Pager pager4 = this.pager;
            Intrinsics.checkNotNull(pager4);
            removeDots(size3 - pager4.getCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void refreshDotsColors() {
        int size = this.dots.size();
        for (int i = 0; i < size; i++) {
            refreshDotColor(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int dpToPx(int i) {
        return (int) (getContext().getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float dpToPxF(float f) {
        return getContext().getResources().getDisplayMetrics().density * f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void addDots(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            addDot(i2);
        }
    }

    private final void removeDots(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            removeDot();
        }
    }

    public final void refreshDots() {
        if (this.pager == null) {
            return;
        }
        post(new Runnable() { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BaseDotsIndicator.m7199refreshDots$lambda1(BaseDotsIndicator.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshDots$lambda-1  reason: not valid java name */
    public static final void m7199refreshDots$lambda1(BaseDotsIndicator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshDotsCount();
        this$0.refreshDotsColors();
        this$0.refreshDotsSize();
        this$0.refreshOnPageChangedListener();
    }

    private final void refreshOnPageChangedListener() {
        Pager pager = this.pager;
        Intrinsics.checkNotNull(pager);
        if (pager.isNotEmpty()) {
            Pager pager2 = this.pager;
            Intrinsics.checkNotNull(pager2);
            pager2.removeOnPageChangeListener();
            OnPageChangeListenerHelper buildOnPageChangedListener = buildOnPageChangedListener();
            Pager pager3 = this.pager;
            Intrinsics.checkNotNull(pager3);
            pager3.addOnPageChangeListener(buildOnPageChangedListener);
            Pager pager4 = this.pager;
            Intrinsics.checkNotNull(pager4);
            buildOnPageChangedListener.onPageScrolled(pager4.getCurrentItem(), 0.0f);
        }
    }

    private final void refreshDotsSize() {
        for (ImageView imageView : this.dots) {
            ExtensionsKt.setWidth(imageView, (int) this.dotsSize);
        }
    }

    @Deprecated(message = "Use setDotsColors(color) instead", replaceWith = @ReplaceWith(expression = "setDotsColors(color)", imports = {}))
    public final void setPointsColor(int i) {
        setDotsColor(i);
        refreshDotsColors();
    }

    @Deprecated(message = "Use attachTo(viewPager) instead", replaceWith = @ReplaceWith(expression = "attachTo(viewPager)", imports = {}))
    public final void setViewPager(ViewPager viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        new ViewPagerAttacher().setup(this, viewPager);
    }

    @Deprecated(message = "Use attachTo(viewPager) instead", replaceWith = @ReplaceWith(expression = "attachTo(viewPager)", imports = {}))
    public final void setViewPager2(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager2");
        new ViewPager2Attacher().setup(this, viewPager2);
    }

    public final void attachTo(ViewPager viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        new ViewPagerAttacher().setup(this, viewPager);
    }

    public final void attachTo(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager2");
        new ViewPager2Attacher().setup(this, viewPager2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        post(new Runnable() { // from class: com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseDotsIndicator.m7198onRestoreInstanceState$lambda3(BaseDotsIndicator.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onRestoreInstanceState$lambda-3  reason: not valid java name */
    public static final void m7198onRestoreInstanceState$lambda3(BaseDotsIndicator this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshDots();
    }
}
