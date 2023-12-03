package ol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.AssetProviderSingleton;
import com.theinnerhour.b2b.utils.LogHelper;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
import mm.h;
import ol.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27669u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ hs.f f27670v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.e f27671w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.c0 f27672x;

    public /* synthetic */ n(RecyclerView.e eVar, hs.f fVar, RecyclerView.c0 c0Var, int i6) {
        this.f27669u = i6;
        this.f27671w = eVar;
        this.f27670v = fVar;
        this.f27672x = c0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d7, code lost:
        if (((java.util.Collection) r8).isEmpty() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014a, code lost:
        if (((java.util.Collection) r8).isEmpty() == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        Chip chip;
        Object obj;
        Chip chip2;
        Object obj2;
        Chip chip3;
        Object obj3;
        Chip chip4;
        Object obj4;
        int i6 = this.f27669u;
        boolean z11 = false;
        hs.f actualOption = this.f27670v;
        RecyclerView.c0 c0Var = this.f27672x;
        RecyclerView.e eVar = this.f27671w;
        switch (i6) {
            case 0:
                o this$0 = (o) eVar;
                o.a parentViewHolder = (o.a) c0Var;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(actualOption, "$actualOption");
                kotlin.jvm.internal.i.g(parentViewHolder, "$parentViewHolder");
                this$0.A.invoke();
                String str = this$0.B;
                ArrayList<hs.f<String, ArrayList<String>>> arrayList = this$0.f27674y;
                A a10 = actualOption.f19464u;
                if (z10) {
                    if (compoundButton instanceof Chip) {
                        chip4 = (Chip) compoundButton;
                    } else {
                        chip4 = null;
                    }
                    if (chip4 != null) {
                        chip4.setChipBackgroundColorResource(R.color.amahaLightGreen);
                        chip4.setChipStrokeColorResource(R.color.amahaLightGreen);
                        chip4.setTextColor(g0.a.b(chip4.getContext(), R.color.amahaGreen));
                        AssetProviderSingleton assetProviderSingleton = AssetProviderSingleton.INSTANCE;
                        Context context = ((Chip) compoundButton).getContext();
                        kotlin.jvm.internal.i.f(context, "chipView.context");
                        chip4.setTypeface(assetProviderSingleton.getTypeface(context, "Lato-Bold.ttf"));
                    }
                    try {
                        Iterator<T> it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj4 = it.next();
                                if (kotlin.jvm.internal.i.b(((hs.f) obj4).f19464u, a10)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        hs.f fVar = (hs.f) obj4;
                        if (fVar != null) {
                            ((ArrayList) fVar.f19465v).add(compoundButton.getText().toString());
                        } else {
                            arrayList.add(new hs.f<>(a10, ca.a.k(compoundButton.getText().toString())));
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str, e10);
                    }
                } else {
                    if (compoundButton instanceof Chip) {
                        chip3 = (Chip) compoundButton;
                    } else {
                        chip3 = null;
                    }
                    if (chip3 != null) {
                        chip3.setTextColor(g0.a.b(chip3.getContext(), R.color.amahaDarkGray));
                        chip3.setChipStrokeColorResource(R.color.proDashboardFooter);
                        chip3.setChipBackgroundColorResource(R.color.white);
                        AssetProviderSingleton assetProviderSingleton2 = AssetProviderSingleton.INSTANCE;
                        Context context2 = ((Chip) compoundButton).getContext();
                        kotlin.jvm.internal.i.f(context2, "chipView.context");
                        chip3.setTypeface(assetProviderSingleton2.getTypeface(context2, "Lato-Medium.ttf"));
                    }
                    try {
                        Iterator<T> it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (kotlin.jvm.internal.i.b(((hs.f) obj3).f19464u, a10)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        hs.f fVar2 = (hs.f) obj3;
                        if (fVar2 != null) {
                            B b10 = fVar2.f19465v;
                            if (!((ArrayList) b10).contains(compoundButton.getText().toString())) {
                                break;
                            } else {
                                ((ArrayList) b10).remove(compoundButton.getText().toString());
                                if (((ArrayList) b10).isEmpty()) {
                                    arrayList.remove(fVar2);
                                }
                            }
                        }
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(str, e11);
                    }
                    View view = parentViewHolder.f2751a;
                    Context context3 = this$0.f27675z;
                    if (!z11) {
                        ((AppCompatImageView) view.findViewById(R.id.ivN5ScreenRowCheckbox)).setBackgroundColor(g0.a.b(context3, R.color.amahaLightGreen));
                        ((AppCompatImageView) view.findViewById(R.id.ivN5ScreenRowCheckbox)).setImageDrawable(a.c.b(context3, R.drawable.ic_checkbox_amaha_green));
                        ((AppCompatImageView) view.findViewById(R.id.ivN5ScreenRowCheckbox)).setImageTintList(null);
                        return;
                    }
                    ((AppCompatImageView) view.findViewById(R.id.ivN5ScreenRowCheckbox)).setBackgroundColor(g0.a.b(context3, R.color.white));
                    ((AppCompatImageView) view.findViewById(R.id.ivN5ScreenRowCheckbox)).setImageDrawable(a.c.b(context3, R.drawable.ic_check_box_outline_blank_blue_24dp));
                    ((AppCompatImageView) view.findViewById(R.id.ivN5ScreenRowCheckbox)).setImageTintList(ColorStateList.valueOf(g0.a.b(context3, R.color.amahaGreen)));
                    return;
                }
                z11 = true;
                View view2 = parentViewHolder.f2751a;
                Context context32 = this$0.f27675z;
                if (!z11) {
                }
            default:
                mm.h this$02 = (mm.h) eVar;
                h.a parentViewHolder2 = (h.a) c0Var;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(actualOption, "$actualOption");
                kotlin.jvm.internal.i.g(parentViewHolder2, "$parentViewHolder");
                String str2 = this$02.B;
                ArrayList<hs.f<String, ArrayList<String>>> arrayList2 = this$02.f25634y;
                A a11 = actualOption.f19464u;
                if (z10) {
                    if (compoundButton instanceof Chip) {
                        chip2 = (Chip) compoundButton;
                    } else {
                        chip2 = null;
                    }
                    if (chip2 != null) {
                        chip2.setChipBackgroundColorResource(R.color.amahaLightGreen);
                        chip2.setChipStrokeColorResource(R.color.amahaLightGreen);
                        chip2.setTextColor(g0.a.b(chip2.getContext(), R.color.amahaGreen));
                        AssetProviderSingleton assetProviderSingleton3 = AssetProviderSingleton.INSTANCE;
                        Context context4 = ((Chip) compoundButton).getContext();
                        kotlin.jvm.internal.i.f(context4, "chipView.context");
                        chip2.setTypeface(assetProviderSingleton3.getTypeface(context4, "Lato-Bold.ttf"));
                    }
                    try {
                        Iterator<T> it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (kotlin.jvm.internal.i.b(((hs.f) obj2).f19464u, a11)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        hs.f fVar3 = (hs.f) obj2;
                        if (fVar3 != null) {
                            ((ArrayList) fVar3.f19465v).add(compoundButton.getText().toString());
                        } else {
                            arrayList2.add(new hs.f<>(a11, ca.a.k(compoundButton.getText().toString())));
                        }
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(str2, e12);
                    }
                } else {
                    if (compoundButton instanceof Chip) {
                        chip = (Chip) compoundButton;
                    } else {
                        chip = null;
                    }
                    if (chip != null) {
                        chip.setTextColor(g0.a.b(chip.getContext(), R.color.amahaDarkGray));
                        chip.setChipStrokeColorResource(R.color.proDashboardFooter);
                        chip.setChipBackgroundColorResource(R.color.white);
                        AssetProviderSingleton assetProviderSingleton4 = AssetProviderSingleton.INSTANCE;
                        Context context5 = ((Chip) compoundButton).getContext();
                        kotlin.jvm.internal.i.f(context5, "chipView.context");
                        chip.setTypeface(assetProviderSingleton4.getTypeface(context5, "Lato-Medium.ttf"));
                    }
                    try {
                        Iterator<T> it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj = it4.next();
                                if (kotlin.jvm.internal.i.b(((hs.f) obj).f19464u, a11)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        hs.f fVar4 = (hs.f) obj;
                        if (fVar4 != null) {
                            B b11 = fVar4.f19465v;
                            if (!((ArrayList) b11).contains(compoundButton.getText().toString())) {
                                break;
                            } else {
                                ((ArrayList) b11).remove(compoundButton.getText().toString());
                                if (((ArrayList) b11).isEmpty()) {
                                    arrayList2.remove(fVar4);
                                }
                            }
                        }
                    } catch (Exception e13) {
                        LogHelper.INSTANCE.e(str2, e13);
                    }
                    View view3 = parentViewHolder2.f2751a;
                    Context context6 = this$02.f25635z;
                    if (!z11) {
                        ((AppCompatImageView) view3.findViewById(R.id.ivJTAScreenRowCheckbox)).setBackgroundColor(g0.a.b(context6, R.color.amahaLightGreen));
                        ((AppCompatImageView) view3.findViewById(R.id.ivJTAScreenRowCheckbox)).setImageDrawable(a.c.b(context6, R.drawable.ic_checkbox_amaha_green));
                        ((AppCompatImageView) view3.findViewById(R.id.ivJTAScreenRowCheckbox)).setImageTintList(null);
                        return;
                    }
                    ((AppCompatImageView) view3.findViewById(R.id.ivJTAScreenRowCheckbox)).setBackgroundColor(g0.a.b(context6, R.color.white));
                    ((AppCompatImageView) view3.findViewById(R.id.ivJTAScreenRowCheckbox)).setImageDrawable(a.c.b(context6, R.drawable.ic_check_box_outline_blank_blue_24dp));
                    ((AppCompatImageView) view3.findViewById(R.id.ivJTAScreenRowCheckbox)).setImageTintList(ColorStateList.valueOf(g0.a.b(context6, R.color.amahaGreen)));
                    return;
                }
                z11 = true;
                View view32 = parentViewHolder2.f2751a;
                Context context62 = this$02.f25635z;
                if (!z11) {
                }
        }
    }
}
