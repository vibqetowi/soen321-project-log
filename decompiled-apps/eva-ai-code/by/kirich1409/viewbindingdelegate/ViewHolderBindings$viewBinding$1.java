package by.kirich1409.viewbindingdelegate;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
/* compiled from: ViewHolderBindings.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class ViewHolderBindings$viewBinding$1 extends PropertyReference1Impl {
    public static final ViewHolderBindings$viewBinding$1 INSTANCE = new ViewHolderBindings$viewBinding$1();

    public ViewHolderBindings$viewBinding$1() {
        super(RecyclerView.ViewHolder.class, "itemView", "getItemView()Landroid/view/View;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((RecyclerView.ViewHolder) obj).itemView;
    }
}
