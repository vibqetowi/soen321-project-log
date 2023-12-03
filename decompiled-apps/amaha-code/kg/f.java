package kg;

import android.app.Dialog;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hbb20.CountryCodePicker;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: CountryCodeAdapter.java */
/* loaded from: classes.dex */
public final class f extends RecyclerView.e<a> implements k6.b {
    public final CountryCodePicker A;
    public final LayoutInflater B;
    public final EditText C;
    public final Dialog D;
    public final Context E;
    public final ImageView F;
    public int G = 0;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f23330x;

    /* renamed from: y  reason: collision with root package name */
    public final List<com.hbb20.a> f23331y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f23332z;

    /* compiled from: CountryCodeAdapter.java */
    /* loaded from: classes.dex */
    public class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RelativeLayout f23333u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f23334v;

        /* renamed from: w  reason: collision with root package name */
        public final TextView f23335w;

        /* renamed from: x  reason: collision with root package name */
        public final ImageView f23336x;

        /* renamed from: y  reason: collision with root package name */
        public final LinearLayout f23337y;

        /* renamed from: z  reason: collision with root package name */
        public final View f23338z;

        public a(View view) {
            super(view);
            RelativeLayout relativeLayout = (RelativeLayout) view;
            this.f23333u = relativeLayout;
            TextView textView = (TextView) relativeLayout.findViewById(R.id.textView_countryName);
            this.f23334v = textView;
            TextView textView2 = (TextView) relativeLayout.findViewById(R.id.textView_code);
            this.f23335w = textView2;
            this.f23336x = (ImageView) relativeLayout.findViewById(R.id.image_flag);
            this.f23337y = (LinearLayout) relativeLayout.findViewById(R.id.linear_flag_holder);
            View findViewById = relativeLayout.findViewById(R.id.preferenceDivider);
            this.f23338z = findViewById;
            int dialogTextColor = f.this.A.getDialogTextColor();
            CountryCodePicker countryCodePicker = f.this.A;
            if (dialogTextColor != 0) {
                textView.setTextColor(countryCodePicker.getDialogTextColor());
                textView2.setTextColor(countryCodePicker.getDialogTextColor());
                findViewById.setBackgroundColor(countryCodePicker.getDialogTextColor());
            }
            if (countryCodePicker.getCcpDialogRippleEnable()) {
                TypedValue typedValue = new TypedValue();
                f.this.E.getTheme().resolveAttribute(16843534, typedValue, true);
                int i6 = typedValue.resourceId;
                if (i6 != 0) {
                    relativeLayout.setBackgroundResource(i6);
                } else {
                    relativeLayout.setBackgroundResource(typedValue.data);
                }
            }
            try {
                if (countryCodePicker.getDialogTypeFace() != null) {
                    if (countryCodePicker.getDialogTypeFaceStyle() != -99) {
                        textView2.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                        textView.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                        return;
                    }
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public f(Context context, List<com.hbb20.a> list, CountryCodePicker countryCodePicker, RelativeLayout relativeLayout, EditText editText, TextView textView, Dialog dialog, ImageView imageView) {
        this.f23330x = null;
        this.f23331y = null;
        this.E = context;
        this.f23331y = list;
        this.A = countryCodePicker;
        this.D = dialog;
        this.f23332z = textView;
        this.C = editText;
        this.F = imageView;
        this.B = LayoutInflater.from(context);
        this.f23330x = v("");
        if (countryCodePicker.f10098d0) {
            imageView.setVisibility(8);
            editText.addTextChangedListener(new c(this));
            editText.setOnEditorActionListener(new d(this));
            imageView.setOnClickListener(new b(this));
            return;
        }
        relativeLayout.setVisibility(8);
    }

    @Override // k6.b
    public final String c(int i6) {
        com.hbb20.a aVar = (com.hbb20.a) this.f23330x.get(i6);
        if (this.G > i6) {
            return "★";
        }
        if (aVar != null) {
            return aVar.f10144w.substring(0, 1);
        }
        return "☺";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f23330x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        String str;
        a aVar2 = aVar;
        com.hbb20.a aVar3 = (com.hbb20.a) this.f23330x.get(i6);
        View view = aVar2.f23338z;
        LinearLayout linearLayout = aVar2.f23337y;
        TextView textView = aVar2.f23334v;
        TextView textView2 = aVar2.f23335w;
        if (aVar3 != null) {
            view.setVisibility(8);
            textView.setVisibility(0);
            textView2.setVisibility(0);
            f fVar = f.this;
            if (fVar.A.T) {
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            CountryCodePicker countryCodePicker = fVar.A;
            if (countryCodePicker.getCcpDialogShowFlag() && countryCodePicker.f10104k0) {
                str = com.hbb20.a.l(aVar3).concat("   ");
            } else {
                str = "";
            }
            StringBuilder c10 = v.h.c(str);
            c10.append(aVar3.f10144w);
            String sb2 = c10.toString();
            if (countryCodePicker.getCcpDialogShowNameCode()) {
                StringBuilder d10 = v.g.d(sb2, " (");
                d10.append(aVar3.f10142u.toUpperCase(Locale.US));
                d10.append(")");
                sb2 = d10.toString();
            }
            textView.setText(sb2);
            textView2.setText("+" + aVar3.f10143v);
            if (countryCodePicker.getCcpDialogShowFlag() && !countryCodePicker.f10104k0) {
                linearLayout.setVisibility(0);
                if (aVar3.f10146y == -99) {
                    aVar3.f10146y = com.hbb20.a.n(aVar3);
                }
                aVar2.f23336x.setImageResource(aVar3.f10146y);
            } else {
                linearLayout.setVisibility(8);
            }
        } else {
            view.setVisibility(0);
            textView.setVisibility(8);
            textView2.setVisibility(8);
            linearLayout.setVisibility(8);
        }
        int size = this.f23330x.size();
        RelativeLayout relativeLayout = aVar2.f23333u;
        if (size > i6 && this.f23330x.get(i6) != null) {
            relativeLayout.setOnClickListener(new e(this, i6));
        } else {
            relativeLayout.setOnClickListener(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        return new a(this.B.inflate(R.layout.layout_recycler_country_tile, (ViewGroup) recyclerView, false));
    }

    public final ArrayList v(String str) {
        ArrayList arrayList = new ArrayList();
        this.G = 0;
        CountryCodePicker countryCodePicker = this.A;
        ArrayList arrayList2 = countryCodePicker.f10113t0;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = countryCodePicker.f10113t0.iterator();
            while (it.hasNext()) {
                com.hbb20.a aVar = (com.hbb20.a) it.next();
                if (aVar.t(str)) {
                    arrayList.add(aVar);
                    this.G++;
                }
            }
            if (arrayList.size() > 0) {
                arrayList.add(null);
                this.G++;
            }
        }
        for (com.hbb20.a aVar2 : this.f23331y) {
            if (aVar2.t(str)) {
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }
}
