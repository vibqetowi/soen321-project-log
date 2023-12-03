package ol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N12CScreenFragment;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.t;
import ik.j1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: N12CScreenAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {
    public final ArrayList<pl.f> A;
    public final List<HashMap<?, ?>> B;
    public final List<HashMap<?, ?>> C;
    public final ArrayList<String> D;
    public final ss.a<hs.k> E;
    public final ss.a<hs.k> F;
    public final ss.a<hs.k> G;
    public final String H;
    public hs.f<String, String> I;
    public boolean J;

    /* renamed from: x  reason: collision with root package name */
    public final String f27615x;

    /* renamed from: y  reason: collision with root package name */
    public final String f27616y;

    /* renamed from: z  reason: collision with root package name */
    public final hs.j<String, String, String> f27617z;

    /* compiled from: N12CScreenAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public b(String str, String str2, hs.j jVar, ArrayList optionsList, ArrayList arrayList, ArrayList arrayList2, ArrayList selectedItems, N12CScreenFragment.c cVar, N12CScreenFragment.d dVar, N12CScreenFragment.a aVar) {
        kotlin.jvm.internal.i.g(optionsList, "optionsList");
        kotlin.jvm.internal.i.g(selectedItems, "selectedItems");
        this.f27615x = str;
        this.f27616y = str2;
        this.f27617z = jVar;
        this.A = optionsList;
        this.B = arrayList;
        this.C = arrayList2;
        this.D = selectedItems;
        this.E = cVar;
        this.F = dVar;
        this.G = aVar;
        this.H = LogHelper.INSTANCE.makeLogTag("N12CScreenAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        String str2;
        ColorStateList colorStateList;
        ArrayList<String> arrayList = this.D;
        ArrayList<pl.f> arrayList2 = this.A;
        int i10 = 0;
        View view = aVar.f2751a;
        try {
            if (i6 == 0) {
                String str3 = this.f27615x;
                if (str3 != null) {
                    Glide.g(view.getContext()).p(str3).B((ShapeableImageView) view.findViewById(R.id.ivN12CAddYourOwn));
                }
                RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvN12CAddYourOwn);
                if (robertoTextView != null) {
                    String str4 = this.f27616y;
                    if (str4 == null) {
                        str4 = "";
                    }
                    robertoTextView.setText(str4);
                }
                for (pl.f fVar : arrayList2) {
                    String str5 = fVar.f28590c;
                    if (str5 != null) {
                        Extensions extensions = Extensions.INSTANCE;
                        Context context = view.getContext();
                        kotlin.jvm.internal.i.f(context, "context");
                        LinearLayout llN12CList = (LinearLayout) view.findViewById(R.id.llN12CList);
                        kotlin.jvm.internal.i.f(llN12CList, "llN12CList");
                        View inflateLayout = extensions.inflateLayout(context, R.layout.row_n12c_item, llN12CList);
                        kotlin.jvm.internal.i.e(inflateLayout, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflateLayout;
                        String str6 = fVar.f28588a;
                        if (str6 != null) {
                            Glide.g(view.getContext()).p(str6).B((ImageView) constraintLayout.findViewById(R.id.ivRowN12CAddYourOwn));
                        }
                        ((TextView) constraintLayout.findViewById(R.id.tvRowN12CAddYourOwn)).setText(str5);
                        if (arrayList.contains(str5)) {
                            colorStateList = g0.a.c(R.color.amahaLightGreen, view.getContext());
                        } else {
                            colorStateList = null;
                        }
                        constraintLayout.setBackgroundTintList(colorStateList);
                        constraintLayout.setOnClickListener(new tk.q(this, str5, constraintLayout, view));
                        if (this.J) {
                            this.J = false;
                            arrayList.add(str5);
                            constraintLayout.setBackgroundTintList(g0.a.c(R.color.amahaLightGreen, view.getContext()));
                        }
                        ((LinearLayout) view.findViewById(R.id.llN12CList)).addView(constraintLayout);
                    }
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.clN12CAddYourOwn);
                if (constraintLayout2 != null) {
                    constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ol.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ b f27614v;

                        {
                            this.f27614v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i11 = r2;
                            b this$0 = this.f27614v;
                            switch (i11) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.F.invoke();
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.G.invoke();
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            List<HashMap<?, ?>> list = this.B;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    HashMap hashMap = (HashMap) it.next();
                    Extensions extensions2 = Extensions.INSTANCE;
                    Context context2 = view.getContext();
                    kotlin.jvm.internal.i.f(context2, "context");
                    LinearLayout llN12CAdditionalOptions = (LinearLayout) view.findViewById(R.id.llN12CAdditionalOptions);
                    kotlin.jvm.internal.i.f(llN12CAdditionalOptions, "llN12CAdditionalOptions");
                    View inflateLayout2 = extensions2.inflateLayout(context2, R.layout.row_n12c_additional_text, llN12CAdditionalOptions);
                    kotlin.jvm.internal.i.e(inflateLayout2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) inflateLayout2;
                    RobertoTextView robertoTextView2 = (RobertoTextView) constraintLayout3.findViewById(R.id.tvN12CAdditionalText);
                    Object obj = hashMap.get("list_key");
                    if (obj instanceof String) {
                        str2 = (String) obj;
                    } else {
                        str2 = null;
                    }
                    robertoTextView2.setText(str2);
                    constraintLayout3.setOnClickListener(new j1(view, 24, hashMap));
                    ((LinearLayout) view.findViewById(R.id.llN12CAdditionalOptions)).addView(constraintLayout3);
                }
            }
            List<HashMap<?, ?>> list2 = this.C;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    HashMap hashMap2 = (HashMap) it2.next();
                    Extensions extensions3 = Extensions.INSTANCE;
                    Context context3 = view.getContext();
                    kotlin.jvm.internal.i.f(context3, "context");
                    LinearLayout llN12CAdditionalImageScroller = (LinearLayout) view.findViewById(R.id.llN12CAdditionalImageScroller);
                    kotlin.jvm.internal.i.f(llN12CAdditionalImageScroller, "llN12CAdditionalImageScroller");
                    View inflateLayout3 = extensions3.inflateLayout(context3, R.layout.row_n12c_additional_image, llN12CAdditionalImageScroller);
                    kotlin.jvm.internal.i.e(inflateLayout3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) inflateLayout3;
                    Object obj2 = hashMap2.get("image");
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        Glide.g(view.getContext()).p(str).B((ImageView) constraintLayout4.findViewById(R.id.ivRowN12CItemImage));
                    }
                    constraintLayout4.setOnClickListener(new tk.q((Object) view, (Object) constraintLayout4, (Object) this, (Serializable) hashMap2, 2));
                    ((LinearLayout) view.findViewById(R.id.llN12CAdditionalImageScroller)).addView(constraintLayout4);
                }
            }
            int size = arrayList2.size() + 1;
            if (size >= 0) {
                while (true) {
                    Extensions extensions4 = Extensions.INSTANCE;
                    Context context4 = view.getContext();
                    kotlin.jvm.internal.i.f(context4, "context");
                    LinearLayout llN12CAdditionalOptionsViewGenerator = (LinearLayout) view.findViewById(R.id.llN12CAdditionalOptionsViewGenerator);
                    kotlin.jvm.internal.i.f(llN12CAdditionalOptionsViewGenerator, "llN12CAdditionalOptionsViewGenerator");
                    View inflateLayout4 = extensions4.inflateLayout(context4, R.layout.row_n12c_item_height_generator, llN12CAdditionalOptionsViewGenerator);
                    kotlin.jvm.internal.i.e(inflateLayout4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ((LinearLayout) view.findViewById(R.id.llN12CAdditionalOptionsViewGenerator)).addView((ConstraintLayout) inflateLayout4);
                    if (i10 == size) {
                        break;
                    }
                    i10++;
                }
            }
            RobertoEditText robertoEditText = (RobertoEditText) view.findViewById(R.id.etN12CAdditionalTextInput);
            InputFilter[] filters = robertoEditText.getFilters();
            kotlin.jvm.internal.i.f(filters, "editTextView.filters");
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(com.appsflyer.R.styleable.AppCompatTheme_windowFixedHeightMajor);
            int length = filters.length;
            Object[] copyOf = Arrays.copyOf(filters, length + 1);
            copyOf[length] = lengthFilter;
            robertoEditText.setFilters((InputFilter[]) copyOf);
            robertoEditText.addTextChangedListener(new c(view));
            robertoEditText.setOnFocusChangeListener(new dc.b(3, this));
            robertoEditText.setOnClickListener(new View.OnClickListener(this) { // from class: ol.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f27614v;

                {
                    this.f27614v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i11 = r2;
                    b this$0 = this.f27614v;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.F.invoke();
                            return;
                        default:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.G.invoke();
                            return;
                    }
                }
            });
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivN12CAdditionalTextInput);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new t(19, this, view, robertoEditText));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.H, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        int i10;
        kotlin.jvm.internal.i.g(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (i6 == 0) {
            i10 = R.layout.fragment_n12c_screen_view_1;
        } else {
            i10 = R.layout.fragment_n12c_screen_view_2;
        }
        View inflate = from.inflate(i10, (ViewGroup) parent, false);
        kotlin.jvm.internal.i.f(inflate, "from(parent.context).inf…en_view_2, parent, false)");
        a aVar = new a(inflate);
        aVar.s(false);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0029 A[Catch: Exception -> 0x0013, TRY_ENTER, TryCatch #1 {Exception -> 0x0013, blocks: (B:4:0x0007, B:6:0x000d, B:12:0x001b, B:19:0x0029, B:20:0x0036, B:22:0x003a, B:23:0x0047, B:25:0x004b, B:41:0x008f, B:42:0x009b, B:44:0x00a1, B:48:0x00aa, B:50:0x00b1, B:56:0x00e0, B:55:0x00db, B:28:0x0052, B:29:0x0056, B:31:0x005c, B:34:0x006a, B:36:0x0078, B:52:0x00c2), top: B:62:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: Exception -> 0x0013, TryCatch #1 {Exception -> 0x0013, blocks: (B:4:0x0007, B:6:0x000d, B:12:0x001b, B:19:0x0029, B:20:0x0036, B:22:0x003a, B:23:0x0047, B:25:0x004b, B:41:0x008f, B:42:0x009b, B:44:0x00a1, B:48:0x00aa, B:50:0x00b1, B:56:0x00e0, B:55:0x00db, B:28:0x0052, B:29:0x0056, B:31:0x005c, B:34:0x006a, B:36:0x0078, B:52:0x00c2), top: B:62:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(Context context, RobertoEditText robertoEditText) {
        String obj;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        String str3;
        ArrayList<pl.f> arrayList = this.A;
        String str4 = this.H;
        if (robertoEditText != null) {
            try {
                Editable text = robertoEditText.getText();
                if (text != null) {
                    obj = text.toString();
                    if (obj == null && !gv.n.B0(obj)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    hs.j<String, String, String> jVar = this.f27617z;
                    if (!z10) {
                        Toast.makeText(context, jVar.f19473u, 0).show();
                        return;
                    } else if (this.I == null) {
                        Toast.makeText(context, jVar.f19474v, 0).show();
                        return;
                    } else {
                        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                            for (pl.f fVar : arrayList) {
                                String str5 = fVar.f28590c;
                                if (str5 != null) {
                                    Locale ENGLISH = Locale.ENGLISH;
                                    kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
                                    str = str5.toLowerCase(ENGLISH);
                                    kotlin.jvm.internal.i.f(str, "this as java.lang.String).toLowerCase(locale)");
                                } else {
                                    str = null;
                                }
                                Locale ENGLISH2 = Locale.ENGLISH;
                                kotlin.jvm.internal.i.f(ENGLISH2, "ENGLISH");
                                String lowerCase = obj.toLowerCase(ENGLISH2);
                                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                if (kotlin.jvm.internal.i.b(str, lowerCase)) {
                                    z11 = true;
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                            Toast.makeText(context, jVar.f19475w, 0).show();
                            return;
                        }
                        hs.f<String, String> fVar2 = this.I;
                        if (fVar2 != null) {
                            str2 = fVar2.f19464u;
                        } else {
                            str2 = null;
                        }
                        if (fVar2 != null) {
                            str3 = fVar2.f19465v;
                        } else {
                            str3 = null;
                        }
                        arrayList.add(0, new pl.f(str2, null, obj, str3, true));
                        this.J = true;
                        j(0);
                        this.I = null;
                        if (robertoEditText != null) {
                            try {
                                robertoEditText.clearFocus();
                                Object systemService = context.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(robertoEditText.getWindowToken(), 0);
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(str4, e10);
                            }
                        }
                        this.E.invoke();
                        return;
                    }
                }
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str4, e11);
                return;
            }
        }
        obj = null;
        if (obj == null) {
        }
        z10 = true;
        hs.j<String, String, String> jVar2 = this.f27617z;
        if (!z10) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        return i6;
    }
}
