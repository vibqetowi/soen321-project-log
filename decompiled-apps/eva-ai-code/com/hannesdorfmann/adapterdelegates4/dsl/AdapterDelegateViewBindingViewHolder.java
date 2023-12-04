package com.hannesdorfmann.adapterdelegates4.dsl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewBindingListAdapterDelegateDsl.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004:\u0001AB\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ/\u0010-\u001a\u00020\u00102'\u0010.\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nJ\u0012\u0010/\u001a\u0002002\b\b\u0001\u00101\u001a\u000200H\u0007J\u0012\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u00101\u001a\u000200J\u0012\u00104\u001a\u0004\u0018\u0001052\b\b\u0001\u00101\u001a\u000200J\u0010\u00106\u001a\u0002072\b\b\u0001\u00108\u001a\u000200J)\u00106\u001a\u0002072\b\b\u0001\u00108\u001a\u0002002\u0012\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0:\"\u00020\f¢\u0006\u0002\u0010;J\u0014\u0010<\u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0014\u0010>\u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019J\u0014\u0010?\u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019J\u0014\u0010@\u001a\u00020\u00102\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019Rd\u0010\u0011\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n2)\u0010\t\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR.\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00192\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR.\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00192\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR.\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00192\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0019@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b,\u0010\u0016¨\u0006B"}, d2 = {"Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/viewbinding/ViewBinding;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroidx/viewbinding/ViewBinding;Landroid/view/View;)V", "<set-?>", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "name", "payloads", "", "_bind", "get_bind$kotlin_dsl_viewbinding_release", "()Lkotlin/jvm/functions/Function1;", "_item", "get_item$kotlin_dsl_viewbinding_release", "()Ljava/lang/Object;", "set_item$kotlin_dsl_viewbinding_release", "(Ljava/lang/Object;)V", "Lkotlin/Function0;", "", "_onFailedToRecycleView", "get_onFailedToRecycleView$kotlin_dsl_viewbinding_release", "()Lkotlin/jvm/functions/Function0;", "_onViewAttachedToWindow", "get_onViewAttachedToWindow$kotlin_dsl_viewbinding_release", "_onViewDetachedFromWindow", "get_onViewDetachedFromWindow$kotlin_dsl_viewbinding_release", "_onViewRecycled", "get_onViewRecycled$kotlin_dsl_viewbinding_release", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "Landroidx/viewbinding/ViewBinding;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "item", "getItem", "bind", "bindingBlock", "getColor", "", "id", "getColorStateList", "Landroid/content/res/ColorStateList;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getString", "", "resId", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "onFailedToRecycleView", "block", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "Uninitialized", "kotlin-dsl-viewbinding_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AdapterDelegateViewBindingViewHolder<T, V extends ViewBinding> extends RecyclerView.ViewHolder {
    private Function1<? super List<? extends Object>, Unit> _bind;
    private Object _item;
    private Function0<Boolean> _onFailedToRecycleView;
    private Function0<Unit> _onViewAttachedToWindow;
    private Function0<Unit> _onViewDetachedFromWindow;
    private Function0<Unit> _onViewRecycled;
    private final V binding;
    private final Context context;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AdapterDelegateViewBindingViewHolder(ViewBinding viewBinding, View view, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewBinding, view);
        if ((i & 2) != 0) {
            view = viewBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(view, "class AdapterDelegateVie…romWindow = block\n    }\n}");
        }
    }

    public final V getBinding() {
        return this.binding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterDelegateViewBindingViewHolder(V binding, View view) {
        super(view);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(view, "view");
        this.binding = binding;
        this._item = Uninitialized.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.context = context;
    }

    /* compiled from: ViewBindingListAdapterDelegateDsl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder$Uninitialized;", "", "()V", "kotlin-dsl-viewbinding_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Uninitialized {
        public static final Uninitialized INSTANCE = new Uninitialized();

        private Uninitialized() {
        }
    }

    public final Object get_item$kotlin_dsl_viewbinding_release() {
        return this._item;
    }

    public final void set_item$kotlin_dsl_viewbinding_release(Object obj) {
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
        return ContextCompat.getColor(this.context, i);
    }

    public final Drawable getDrawable(int i) {
        return ContextCompat.getDrawable(this.context, i);
    }

    public final ColorStateList getColorStateList(int i) {
        return ContextCompat.getColorStateList(this.context, i);
    }

    public final Function1<List<? extends Object>, Unit> get_bind$kotlin_dsl_viewbinding_release() {
        return this._bind;
    }

    public final Function0<Unit> get_onViewRecycled$kotlin_dsl_viewbinding_release() {
        return this._onViewRecycled;
    }

    public final Function0<Boolean> get_onFailedToRecycleView$kotlin_dsl_viewbinding_release() {
        return this._onFailedToRecycleView;
    }

    public final Function0<Unit> get_onViewAttachedToWindow$kotlin_dsl_viewbinding_release() {
        return this._onViewAttachedToWindow;
    }

    public final Function0<Unit> get_onViewDetachedFromWindow$kotlin_dsl_viewbinding_release() {
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
}
