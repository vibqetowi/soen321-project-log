package com.hannesdorfmann.adapterdelegates4.dsl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ListAdapterDelegateDsl.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001>B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J/\u0010'\u001a\u00020\r2'\u0010(\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007J\u001f\u0010)\u001a\u0002H*\"\b\b\u0001\u0010**\u00020\u00042\b\b\u0001\u0010+\u001a\u00020,¢\u0006\u0002\u0010-J\u0012\u0010.\u001a\u00020,2\b\b\u0001\u0010+\u001a\u00020,H\u0007J\u0010\u0010/\u001a\u0002002\b\b\u0001\u0010+\u001a\u00020,J\u0010\u00101\u001a\u0002022\b\b\u0001\u0010+\u001a\u00020,J\u0010\u00103\u001a\u0002042\b\b\u0001\u00105\u001a\u00020,J)\u00103\u001a\u0002042\b\b\u0001\u00105\u001a\u00020,2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t07\"\u00020\t¢\u0006\u0002\u00108J\u0014\u00109\u001a\u00020\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0014\u0010;\u001a\u00020\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J\u0014\u0010<\u001a\u00020\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\u0016J\u0014\u0010=\u001a\u00020\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\u0016Rd\u0010\u000e\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072)\u0010\u0006\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR.\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00162\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR.\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00162\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR.\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00162\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013¨\u0006?"}, d2 = {"Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewHolder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroid/view/View;)V", "<set-?>", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "name", "payloads", "", "_bind", "get_bind$kotlin_dsl_release", "()Lkotlin/jvm/functions/Function1;", "_item", "get_item$kotlin_dsl_release", "()Ljava/lang/Object;", "set_item$kotlin_dsl_release", "(Ljava/lang/Object;)V", "Lkotlin/Function0;", "", "_onFailedToRecycleView", "get_onFailedToRecycleView$kotlin_dsl_release", "()Lkotlin/jvm/functions/Function0;", "_onViewAttachedToWindow", "get_onViewAttachedToWindow$kotlin_dsl_release", "_onViewDetachedFromWindow", "get_onViewDetachedFromWindow$kotlin_dsl_release", "_onViewRecycled", "get_onViewRecycled$kotlin_dsl_release", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "item", "getItem", "bind", "bindingBlock", "findViewById", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "id", "", "(I)Landroid/view/View;", "getColor", "getColorStateList", "Landroid/content/res/ColorStateList;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getString", "", "resId", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "onFailedToRecycleView", "block", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "Uninitialized", "kotlin-dsl_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AdapterDelegateViewHolder<T> extends RecyclerView.ViewHolder {
    private Function1<? super List<? extends Object>, Unit> _bind;
    private Object _item;
    private Function0<Boolean> _onFailedToRecycleView;
    private Function0<Unit> _onViewAttachedToWindow;
    private Function0<Unit> _onViewDetachedFromWindow;
    private Function0<Unit> _onViewRecycled;
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterDelegateViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this._item = Uninitialized.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.context = context;
    }

    /* compiled from: ListAdapterDelegateDsl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewHolder$Uninitialized;", "", "()V", "kotlin-dsl_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Uninitialized {
        public static final Uninitialized INSTANCE = new Uninitialized();

        private Uninitialized() {
        }
    }

    public final Object get_item$kotlin_dsl_release() {
        return this._item;
    }

    public final void set_item$kotlin_dsl_release(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this._item = obj;
    }

    public final T getItem() {
        if (this._item == Uninitialized.INSTANCE) {
            throw new IllegalArgumentException("Item has not been set yet. That is an internal issue. Please report at https://github.com/sockeqwe/AdapterDelegates");
        }
        return (T) this._item;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getString(int i) {
        String string = this.context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(resId)");
        return string;
    }

    public final String getString(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = this.context.getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(resId, *formatArgs)");
        return string;
    }

    public final int getColor(int i) {
        return this.context.getColor(i);
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = this.context.getDrawable(i);
        Intrinsics.checkNotNull(drawable);
        Intrinsics.checkNotNullExpressionValue(drawable, "{\n            context.getDrawable(id)!!\n        }");
        return drawable;
    }

    public final ColorStateList getColorStateList(int i) {
        ColorStateList colorStateList = this.context.getColorStateList(i);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "{\n            context.ge…orStateList(id)\n        }");
        return colorStateList;
    }

    public final Function1<List<? extends Object>, Unit> get_bind$kotlin_dsl_release() {
        return this._bind;
    }

    public final Function0<Unit> get_onViewRecycled$kotlin_dsl_release() {
        return this._onViewRecycled;
    }

    public final Function0<Boolean> get_onFailedToRecycleView$kotlin_dsl_release() {
        return this._onFailedToRecycleView;
    }

    public final Function0<Unit> get_onViewAttachedToWindow$kotlin_dsl_release() {
        return this._onViewAttachedToWindow;
    }

    public final Function0<Unit> get_onViewDetachedFromWindow$kotlin_dsl_release() {
        return this._onViewDetachedFromWindow;
    }

    public final void bind(Function1<? super List<? extends Object>, Unit> bindingBlock) {
        Intrinsics.checkNotNullParameter(bindingBlock, "bindingBlock");
        if (this._bind != null) {
            throw new IllegalStateException("bind { ... } is already defined. Only one bind { ... } is allowed.");
        }
        this._bind = bindingBlock;
    }

    public final void onViewRecycled(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this._onViewRecycled != null) {
            throw new IllegalStateException("onViewRecycled { ... } is already defined. Only one onViewRecycled { ... } is allowed.");
        }
        this._onViewRecycled = block;
    }

    public final void onFailedToRecycleView(Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this._onFailedToRecycleView != null) {
            throw new IllegalStateException("onFailedToRecycleView { ... } is already defined. Only one onFailedToRecycleView { ... } is allowed.");
        }
        this._onFailedToRecycleView = block;
    }

    public final void onViewAttachedToWindow(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this._onViewAttachedToWindow != null) {
            throw new IllegalStateException("onViewAttachedToWindow { ... } is already defined. Only one onViewAttachedToWindow { ... } is allowed.");
        }
        this._onViewAttachedToWindow = block;
    }

    public final void onViewDetachedFromWindow(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this._onViewDetachedFromWindow != null) {
            throw new IllegalStateException("onViewDetachedFromWindow { ... } is already defined. Only one onViewDetachedFromWindow { ... } is allowed.");
        }
        this._onViewDetachedFromWindow = block;
    }

    public final <V extends View> V findViewById(int i) {
        V v = (V) this.itemView.findViewById(i);
        if (v != null) {
            return v;
        }
        throw new NullPointerException("null cannot be cast to non-null type V of com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewHolder.findViewById");
    }
}
