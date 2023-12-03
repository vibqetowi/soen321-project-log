package com.hbb20;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.theinnerhour.b2b.R;
import ds.c;
import g0.a;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class CountryCodePicker extends RelativeLayout {
    public static final /* synthetic */ int Z0 = 0;
    public LayoutInflater A;
    public g A0;
    public TextView B;
    public g B0;
    public EditText C;
    public boolean C0;
    public RelativeLayout D;
    public boolean D0;
    public ImageView E;
    public boolean E0;
    public ImageView F;
    public boolean F0;
    public LinearLayout G;
    public boolean G0;
    public LinearLayout H;
    public boolean H0;
    public com.hbb20.a I;
    public String I0;
    public com.hbb20.a J;
    public com.hbb20.f J0;
    public RelativeLayout K;
    public kg.h K0;
    public CountryCodePicker L;
    public TextWatcher L0;
    public k M;
    public boolean M0;
    public String N;
    public String N0;
    public c O;
    public int O0;
    public ds.c P;
    public boolean P0;
    public boolean Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public int S0;
    public boolean T;
    public int T0;
    public boolean U;
    public int U0;
    public boolean V;
    public int V0;
    public boolean W;
    public float W0;
    public com.hbb20.b X0;
    public final a Y0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f10096a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f10097b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f10098d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f10099f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f10100g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f10101h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f10102i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f10103j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f10104k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f10105l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f10106m0;

    /* renamed from: n0  reason: collision with root package name */
    public i f10107n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f10108o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f10109p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f10110q0;

    /* renamed from: r0  reason: collision with root package name */
    public Typeface f10111r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f10112s0;

    /* renamed from: t0  reason: collision with root package name */
    public ArrayList f10113t0;

    /* renamed from: u  reason: collision with root package name */
    public kg.a f10114u;

    /* renamed from: u0  reason: collision with root package name */
    public int f10115u0;

    /* renamed from: v  reason: collision with root package name */
    public final String f10116v;

    /* renamed from: v0  reason: collision with root package name */
    public String f10117v0;

    /* renamed from: w  reason: collision with root package name */
    public int f10118w;

    /* renamed from: w0  reason: collision with root package name */
    public int f10119w0;

    /* renamed from: x  reason: collision with root package name */
    public String f10120x;

    /* renamed from: x0  reason: collision with root package name */
    public List<com.hbb20.a> f10121x0;

    /* renamed from: y  reason: collision with root package name */
    public final Context f10122y;

    /* renamed from: y0  reason: collision with root package name */
    public String f10123y0;

    /* renamed from: z  reason: collision with root package name */
    public View f10124z;

    /* renamed from: z0  reason: collision with root package name */
    public String f10125z0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i6 = CountryCodePicker.Z0;
            CountryCodePicker countryCodePicker = CountryCodePicker.this;
            countryCodePicker.getClass();
            if (countryCodePicker.D0) {
                if (countryCodePicker.f10103j0) {
                    countryCodePicker.f(countryCodePicker.getSelectedCountryNameCode());
                } else {
                    countryCodePicker.f(null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        SIM_ONLY("1"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_ONLY("2"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_ONLY("3"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_NETWORK("12"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_SIM("21"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_LOCALE("13"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_SIM("31"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_LOCALE("23"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_NETWORK("32"),
        SIM_NETWORK_LOCALE("123"),
        /* JADX INFO: Fake field, exist only in values array */
        SIM_LOCALE_NETWORK("132"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_SIM_LOCALE("213"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_LOCALE_SIM("231"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_SIM_NETWORK("312"),
        /* JADX INFO: Fake field, exist only in values array */
        LOCALE_NETWORK_SIM("321");
        

        /* renamed from: u  reason: collision with root package name */
        public final String f10131u;

        c(String str) {
            this.f10131u = str;
        }

        public static c d(String str) {
            c[] values;
            for (c cVar : values()) {
                if (cVar.f10131u.equals(str)) {
                    return cVar;
                }
            }
            return SIM_NETWORK_LOCALE;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    /* loaded from: classes.dex */
    public enum i {
        MOBILE,
        /* JADX INFO: Fake field, exist only in values array */
        FIXED_LINE,
        /* JADX INFO: Fake field, exist only in values array */
        FIXED_LINE_OR_MOBILE,
        /* JADX INFO: Fake field, exist only in values array */
        TOLL_FREE,
        /* JADX INFO: Fake field, exist only in values array */
        PREMIUM_RATE,
        /* JADX INFO: Fake field, exist only in values array */
        SHARED_COST,
        /* JADX INFO: Fake field, exist only in values array */
        VOIP,
        /* JADX INFO: Fake field, exist only in values array */
        PERSONAL_NUMBER,
        /* JADX INFO: Fake field, exist only in values array */
        PAGER,
        /* JADX INFO: Fake field, exist only in values array */
        UAN,
        /* JADX INFO: Fake field, exist only in values array */
        VOICEMAIL,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public interface j {
        void a();
    }

    /* loaded from: classes.dex */
    public enum k {
        /* JADX INFO: Fake field, exist only in values array */
        LEFT(-1),
        /* JADX INFO: Fake field, exist only in values array */
        CENTER(0),
        /* JADX INFO: Fake field, exist only in values array */
        RIGHT(1);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f10140u;

        k(int i6) {
            this.f10140u = i6;
        }
    }

    public CountryCodePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z10;
        int color;
        int color2;
        String str;
        this.f10114u = new df.b(21);
        this.f10116v = "CCP_PREF_FILE";
        this.N = "";
        this.O = c.SIM_NETWORK_LOCALE;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = false;
        this.W = true;
        this.f10096a0 = true;
        this.f10097b0 = true;
        this.c0 = true;
        this.f10098d0 = true;
        this.e0 = true;
        this.f10099f0 = false;
        this.f10100g0 = false;
        this.f10101h0 = true;
        this.f10102i0 = true;
        this.f10103j0 = false;
        this.f10104k0 = false;
        this.f10105l0 = false;
        this.f10106m0 = true;
        this.f10107n0 = i.MOBILE;
        this.f10108o0 = "ccp_last_selection";
        this.f10109p0 = -99;
        this.f10110q0 = -99;
        this.f10115u0 = 0;
        this.f10119w0 = 0;
        g gVar = g.ENGLISH;
        this.A0 = gVar;
        this.B0 = gVar;
        this.C0 = true;
        this.D0 = true;
        this.E0 = false;
        this.F0 = false;
        this.G0 = true;
        this.H0 = false;
        this.I0 = "notSet";
        this.N0 = null;
        this.O0 = 0;
        this.P0 = false;
        this.Q0 = 0;
        this.V0 = 0;
        this.Y0 = new a();
        this.f10122y = context;
        this.A = LayoutInflater.from(context);
        if (attributeSet != null) {
            this.I0 = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_width");
        }
        removeAllViewsInLayout();
        if (attributeSet != null && (str = this.I0) != null && (str.equals("-1") || this.I0.equals("-1") || this.I0.equals("fill_parent") || this.I0.equals("match_parent"))) {
            this.f10124z = this.A.inflate(R.layout.layout_full_width_code_picker, (ViewGroup) this, true);
        } else {
            this.f10124z = this.A.inflate(R.layout.layout_code_picker, (ViewGroup) this, true);
        }
        this.B = (TextView) this.f10124z.findViewById(R.id.textView_selectedCountry);
        this.D = (RelativeLayout) this.f10124z.findViewById(R.id.countryCodeHolder);
        this.E = (ImageView) this.f10124z.findViewById(R.id.imageView_arrow);
        this.F = (ImageView) this.f10124z.findViewById(R.id.image_flag);
        this.H = (LinearLayout) this.f10124z.findViewById(R.id.linear_flag_holder);
        this.G = (LinearLayout) this.f10124z.findViewById(R.id.linear_flag_border);
        this.K = (RelativeLayout) this.f10124z.findViewById(R.id.rlClickConsumer);
        this.L = this;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sc.b.G, 0, 0);
            try {
                try {
                    this.R = obtainStyledAttributes.getBoolean(44, true);
                    this.G0 = obtainStyledAttributes.getBoolean(23, true);
                    boolean z11 = obtainStyledAttributes.getBoolean(45, true);
                    this.S = z11;
                    this.T = obtainStyledAttributes.getBoolean(15, z11);
                    this.f10102i0 = obtainStyledAttributes.getBoolean(14, true);
                    this.f10096a0 = obtainStyledAttributes.getBoolean(16, true);
                    this.f10104k0 = obtainStyledAttributes.getBoolean(49, false);
                    this.f10105l0 = obtainStyledAttributes.getBoolean(48, false);
                    this.f10097b0 = obtainStyledAttributes.getBoolean(13, true);
                    this.f10103j0 = obtainStyledAttributes.getBoolean(7, false);
                    this.c0 = obtainStyledAttributes.getBoolean(9, true);
                    this.V = obtainStyledAttributes.getBoolean(43, false);
                    this.W = obtainStyledAttributes.getBoolean(12, true);
                    this.f10119w0 = obtainStyledAttributes.getColor(4, 0);
                    this.Q0 = obtainStyledAttributes.getColor(6, 0);
                    this.V0 = obtainStyledAttributes.getResourceId(5, 0);
                    this.E0 = obtainStyledAttributes.getBoolean(22, false);
                    this.f10101h0 = obtainStyledAttributes.getBoolean(18, true);
                    this.f10100g0 = obtainStyledAttributes.getBoolean(38, false);
                    this.H0 = obtainStyledAttributes.getBoolean(34, false);
                    this.f10106m0 = obtainStyledAttributes.getBoolean(36, true);
                    int dimension = (int) obtainStyledAttributes.getDimension(37, context.getResources().getDimension(R.dimen.ccp_padding));
                    this.K.setPadding(dimension, dimension, dimension, dimension);
                    this.f10107n0 = i.values()[obtainStyledAttributes.getInt(35, 0)];
                    String string = obtainStyledAttributes.getString(40);
                    this.f10108o0 = string;
                    if (string == null) {
                        this.f10108o0 = "CCP_last_selection";
                    }
                    this.O = c.d(String.valueOf(obtainStyledAttributes.getInt(26, com.appsflyer.R.styleable.AppCompatTheme_windowFixedWidthMinor)));
                    this.F0 = obtainStyledAttributes.getBoolean(21, false);
                    this.e0 = obtainStyledAttributes.getBoolean(41, true);
                    h();
                    this.f10099f0 = obtainStyledAttributes.getBoolean(11, false);
                    this.Q = obtainStyledAttributes.getBoolean(39, true);
                    j();
                    l(obtainStyledAttributes.getBoolean(42, true));
                    setDialogKeyboardAutoPopup(obtainStyledAttributes.getBoolean(8, true));
                    this.A0 = b(obtainStyledAttributes.getInt(29, 9));
                    o();
                    this.f10123y0 = obtainStyledAttributes.getString(28);
                    this.f10125z0 = obtainStyledAttributes.getString(32);
                    if (!isInEditMode()) {
                        i();
                    }
                    this.f10117v0 = obtainStyledAttributes.getString(27);
                    if (!isInEditMode()) {
                        k();
                    }
                    if (obtainStyledAttributes.hasValue(46)) {
                        this.f10115u0 = obtainStyledAttributes.getInt(46, 0);
                    }
                    int i6 = this.f10115u0;
                    if (i6 == -1) {
                        this.B.setGravity(3);
                    } else if (i6 == 0) {
                        this.B.setGravity(17);
                    } else {
                        this.B.setGravity(5);
                    }
                    String string2 = obtainStyledAttributes.getString(30);
                    this.f10120x = string2;
                    if (string2 != null && string2.length() != 0) {
                        if (!isInEditMode()) {
                            if (com.hbb20.a.k(getContext(), getLanguageToApply(), this.f10120x) != null) {
                                setDefaultCountry(com.hbb20.a.k(getContext(), getLanguageToApply(), this.f10120x));
                                setSelectedCountry(this.J);
                                z10 = true;
                            }
                            z10 = false;
                        } else {
                            if (com.hbb20.a.j(this.f10120x) != null) {
                                setDefaultCountry(com.hbb20.a.j(this.f10120x));
                                setSelectedCountry(this.J);
                                z10 = true;
                            }
                            z10 = false;
                        }
                        if (!z10) {
                            setDefaultCountry(com.hbb20.a.j("IN"));
                            setSelectedCountry(this.J);
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    int integer = obtainStyledAttributes.getInteger(31, -1);
                    if (!z10 && integer != -1) {
                        if (!isInEditMode()) {
                            if (integer != -1 && com.hbb20.a.h(getContext(), getLanguageToApply(), this.f10113t0, integer) == null) {
                                integer = 91;
                            }
                            setDefaultCountryUsingPhoneCode(integer);
                            setSelectedCountry(this.J);
                        } else {
                            com.hbb20.a i10 = com.hbb20.a.i(integer + "");
                            i10 = i10 == null ? com.hbb20.a.i("91") : i10;
                            setDefaultCountry(i10);
                            setSelectedCountry(i10);
                        }
                    }
                    if (getDefaultCountry() == null) {
                        setDefaultCountry(com.hbb20.a.j("IN"));
                        if (getSelectedCountry() == null) {
                            setSelectedCountry(this.J);
                        }
                    }
                    if (this.F0 && !isInEditMode()) {
                        setAutoDetectedCountry(true);
                    }
                    if (this.f10100g0 && !isInEditMode()) {
                        g();
                    }
                    setArrowColor(obtainStyledAttributes.getColor(19, -99));
                    if (isInEditMode()) {
                        color = obtainStyledAttributes.getColor(25, -99);
                    } else {
                        color = obtainStyledAttributes.getColor(25, context.getResources().getColor(R.color.defaultContentColor));
                    }
                    if (color != -99) {
                        setContentColor(color);
                    }
                    if (isInEditMode()) {
                        color2 = obtainStyledAttributes.getColor(33, 0);
                    } else {
                        color2 = obtainStyledAttributes.getColor(33, context.getResources().getColor(R.color.defaultBorderFlagColor));
                    }
                    if (color2 != 0) {
                        setFlagBorderColor(color2);
                    }
                    setDialogBackgroundColor(obtainStyledAttributes.getColor(2, 0));
                    setDialogBackground(obtainStyledAttributes.getResourceId(1, 0));
                    setDialogTextColor(obtainStyledAttributes.getColor(17, 0));
                    setDialogSearchEditTextTintColor(obtainStyledAttributes.getColor(10, 0));
                    setDialogCornerRaius(obtainStyledAttributes.getDimension(3, 0.0f));
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(47, 0);
                    if (dimensionPixelSize > 0) {
                        this.B.setTextSize(0, dimensionPixelSize);
                        setFlagSize(dimensionPixelSize);
                        setArrowSize(dimensionPixelSize);
                    }
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(20, 0);
                    if (dimensionPixelSize2 > 0) {
                        setArrowSize(dimensionPixelSize2);
                    }
                    this.f10098d0 = obtainStyledAttributes.getBoolean(0, true);
                    setCcpClickable(obtainStyledAttributes.getBoolean(24, true));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.K.setOnClickListener(this.Y0);
    }

    public static g b(int i6) {
        if (i6 < g.values().length) {
            return g.values()[i6];
        }
        return g.ENGLISH;
    }

    public static boolean c(com.hbb20.a aVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.hbb20.a) it.next()).f10142u.equalsIgnoreCase(aVar.f10142u)) {
                return true;
            }
        }
        return false;
    }

    private g getCCPLanguageFromLocale() {
        g[] values;
        String str;
        String str2;
        Locale locale = this.f10122y.getResources().getConfiguration().locale;
        for (g gVar : g.values()) {
            if (gVar.f10134u.equalsIgnoreCase(locale.getLanguage()) && ((str = gVar.f10135v) == null || str.equalsIgnoreCase(locale.getCountry()) || (str2 = gVar.f10136w) == null || str2.equalsIgnoreCase(locale.getScript()))) {
                return gVar;
            }
        }
        return null;
    }

    private View.OnClickListener getCountryCodeHolderClickListener() {
        return this.Y0;
    }

    private TextWatcher getCountryDetectorTextWatcher() {
        if (this.C != null && this.L0 == null) {
            this.L0 = new b();
        }
        return this.L0;
    }

    private com.hbb20.a getDefaultCountry() {
        return this.J;
    }

    private ds.g getEnteredPhoneNumber() {
        String str;
        EditText editText = this.C;
        if (editText != null) {
            str = ds.c.r(editText.getText().toString());
        } else {
            str = "";
        }
        return getPhoneUtil().t(str, getSelectedCountryNameCode());
    }

    private View getHolderView() {
        return this.f10124z;
    }

    private ds.c getPhoneUtil() {
        if (this.P == null) {
            this.P = ds.c.a(this.f10122y);
        }
        return this.P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.hbb20.a getSelectedCountry() {
        if (this.I == null) {
            setSelectedCountry(getDefaultCountry());
        }
        return this.I;
    }

    private c.a getSelectedHintNumberType() {
        int ordinal = this.f10107n0.ordinal();
        c.a aVar = c.a.MOBILE;
        switch (ordinal) {
            case 0:
                return aVar;
            case 1:
                return c.a.FIXED_LINE;
            case 2:
                return c.a.FIXED_LINE_OR_MOBILE;
            case 3:
                return c.a.TOLL_FREE;
            case 4:
                return c.a.PREMIUM_RATE;
            case 5:
                return c.a.SHARED_COST;
            case 6:
                return c.a.VOIP;
            case 7:
                return c.a.PERSONAL_NUMBER;
            case 8:
                return c.a.PAGER;
            case 9:
                return c.a.UAN;
            case 10:
                return c.a.VOICEMAIL;
            case 11:
                return c.a.UNKNOWN;
            default:
                return aVar;
        }
    }

    private LayoutInflater getmInflater() {
        return this.A;
    }

    private void setCustomDefaultLanguage(g gVar) {
        this.A0 = gVar;
        o();
        if (this.I != null) {
            com.hbb20.a k10 = com.hbb20.a.k(this.f10122y, getLanguageToApply(), this.I.f10142u);
            if (k10 != null) {
                setSelectedCountry(k10);
            }
        }
    }

    private void setDefaultCountry(com.hbb20.a aVar) {
        this.J = aVar;
    }

    private void setHolder(RelativeLayout relativeLayout) {
        this.D = relativeLayout;
    }

    private void setHolderView(View view) {
        this.f10124z = view;
    }

    public final boolean d(String str) {
        List<com.hbb20.a> r;
        i();
        List<com.hbb20.a> list = this.f10121x0;
        if (list != null && list.size() > 0) {
            r = getCustomMasterCountriesList();
        } else {
            r = com.hbb20.a.r(this.f10122y, getLanguageToApply());
        }
        for (com.hbb20.a aVar : r) {
            if (aVar.f10142u.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (getEditText_registeredCarrierNumber() != null && getEditText_registeredCarrierNumber().getText().length() != 0) {
            ds.c phoneUtil = getPhoneUtil();
            return getPhoneUtil().m(phoneUtil.t("+" + this.I.f10143v + getEditText_registeredCarrierNumber().getText().toString(), this.I.f10142u));
        }
        if (getEditText_registeredCarrierNumber() == null) {
            Toast.makeText(this.f10122y, "No editText for Carrier number found.", 0).show();
        }
        return false;
    }

    public final void f(String str) {
        List<com.hbb20.a> r;
        boolean z10;
        int i6;
        CountryCodePicker countryCodePicker = this.L;
        Field field = com.hbb20.e.f10153a;
        com.hbb20.e.f10157e = countryCodePicker.getContext();
        com.hbb20.e.f10156d = new Dialog(com.hbb20.e.f10157e);
        countryCodePicker.i();
        countryCodePicker.k();
        Context context = com.hbb20.e.f10157e;
        countryCodePicker.i();
        List<com.hbb20.a> list = countryCodePicker.f10121x0;
        if (list != null && list.size() > 0) {
            r = countryCodePicker.getCustomMasterCountriesList();
        } else {
            r = com.hbb20.a.r(context, countryCodePicker.getLanguageToApply());
        }
        List<com.hbb20.a> list2 = r;
        com.hbb20.e.f10156d.requestWindowFeature(1);
        com.hbb20.e.f10156d.getWindow().setContentView(R.layout.layout_picker_dialog);
        Window window = com.hbb20.e.f10156d.getWindow();
        Context context2 = com.hbb20.e.f10157e;
        Object obj = g0.a.f16164a;
        window.setBackgroundDrawable(a.c.b(context2, 17170445));
        RecyclerView recyclerView = (RecyclerView) com.hbb20.e.f10156d.findViewById(R.id.recycler_countryDialog);
        TextView textView = (TextView) com.hbb20.e.f10156d.findViewById(R.id.textView_title);
        RelativeLayout relativeLayout = (RelativeLayout) com.hbb20.e.f10156d.findViewById(R.id.rl_query_holder);
        ImageView imageView = (ImageView) com.hbb20.e.f10156d.findViewById(R.id.img_clear_query);
        EditText editText = (EditText) com.hbb20.e.f10156d.findViewById(R.id.editText_search);
        TextView textView2 = (TextView) com.hbb20.e.f10156d.findViewById(R.id.textView_noresult);
        CardView cardView = (CardView) com.hbb20.e.f10156d.findViewById(R.id.cardViewRoot);
        ImageView imageView2 = (ImageView) com.hbb20.e.f10156d.findViewById(R.id.img_dismiss);
        if (countryCodePicker.f10098d0 && countryCodePicker.C0) {
            editText.requestFocus();
            com.hbb20.e.f10156d.getWindow().setSoftInputMode(5);
        } else {
            com.hbb20.e.f10156d.getWindow().setSoftInputMode(2);
        }
        try {
            if (countryCodePicker.getDialogTypeFace() != null) {
                if (countryCodePicker.getDialogTypeFaceStyle() != -99) {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                } else {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (countryCodePicker.getDialogBackgroundColor() != 0) {
            cardView.setCardBackgroundColor(countryCodePicker.getDialogBackgroundColor());
        }
        if (countryCodePicker.getDialogBackgroundResId() != 0) {
            cardView.setBackgroundResource(countryCodePicker.getDialogBackgroundResId());
        }
        cardView.setRadius(countryCodePicker.getDialogCornerRadius());
        if (countryCodePicker.f10099f0) {
            imageView2.setVisibility(0);
            imageView2.setOnClickListener(new kg.g());
        } else {
            imageView2.setVisibility(8);
        }
        if (!countryCodePicker.getCcpDialogShowTitle()) {
            textView.setVisibility(8);
        }
        if (countryCodePicker.getDialogTextColor() != 0) {
            int dialogTextColor = countryCodePicker.getDialogTextColor();
            imageView.setColorFilter(dialogTextColor);
            imageView2.setColorFilter(dialogTextColor);
            textView.setTextColor(dialogTextColor);
            textView2.setTextColor(dialogTextColor);
            editText.setTextColor(dialogTextColor);
            editText.setHintTextColor(Color.argb(100, Color.red(dialogTextColor), Color.green(dialogTextColor), Color.blue(dialogTextColor)));
        }
        if (countryCodePicker.getDialogSearchEditTextTintColor() != 0) {
            editText.setBackgroundTintList(ColorStateList.valueOf(countryCodePicker.getDialogSearchEditTextTintColor()));
            int dialogSearchEditTextTintColor = countryCodePicker.getDialogSearchEditTextTintColor();
            Field field2 = com.hbb20.e.f10154b;
            if (field2 != null) {
                try {
                    Drawable drawable = editText.getContext().getDrawable(com.hbb20.e.f10155c.getInt(editText));
                    drawable.setColorFilter(dialogSearchEditTextTintColor, PorterDuff.Mode.SRC_IN);
                    field2.set(com.hbb20.e.f10153a.get(editText), new Drawable[]{drawable, drawable});
                } catch (Exception unused) {
                }
            }
        }
        textView.setText(countryCodePicker.getDialogTitle());
        editText.setHint(countryCodePicker.getSearchHintText());
        textView2.setText(countryCodePicker.getNoResultACK());
        if (!countryCodePicker.f10098d0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        }
        kg.f fVar = new kg.f(com.hbb20.e.f10157e, list2, countryCodePicker, relativeLayout, editText, textView2, com.hbb20.e.f10156d, imageView);
        recyclerView.setLayoutManager(new LinearLayoutManager(com.hbb20.e.f10157e));
        recyclerView.setAdapter(fVar);
        FastScroller fastScroller = (FastScroller) com.hbb20.e.f10156d.findViewById(R.id.fastscroll);
        fastScroller.setRecyclerView(recyclerView);
        if (countryCodePicker.W) {
            if (countryCodePicker.getFastScrollerBubbleColor() != 0) {
                fastScroller.setBubbleColor(countryCodePicker.getFastScrollerBubbleColor());
            }
            if (countryCodePicker.getFastScrollerHandleColor() != 0) {
                fastScroller.setHandleColor(countryCodePicker.getFastScrollerHandleColor());
            }
            if (countryCodePicker.getFastScrollerBubbleTextAppearance() != 0) {
                try {
                    fastScroller.setBubbleTextAppearance(countryCodePicker.getFastScrollerBubbleTextAppearance());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        } else {
            fastScroller.setVisibility(8);
        }
        com.hbb20.e.f10156d.setOnDismissListener(new com.hbb20.c(countryCodePicker));
        com.hbb20.e.f10156d.setOnCancelListener(new com.hbb20.d(countryCodePicker));
        if (str != null) {
            ArrayList arrayList = countryCodePicker.f10113t0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((com.hbb20.a) it.next()).f10142u.equalsIgnoreCase(str)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                ArrayList arrayList2 = countryCodePicker.f10113t0;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    i6 = countryCodePicker.f10113t0.size() + 1;
                } else {
                    i6 = 0;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= list2.size()) {
                        break;
                    } else if (list2.get(i10).f10142u.equalsIgnoreCase(str)) {
                        recyclerView.h0(i10 + i6);
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        com.hbb20.e.f10156d.show();
        countryCodePicker.getDialogEventsListener();
    }

    public final void g() {
        String string = this.f10122y.getSharedPreferences(this.f10116v, 0).getString(this.f10108o0, null);
        if (string != null) {
            setCountryForNameCode(string);
        }
    }

    public boolean getCcpDialogRippleEnable() {
        return this.c0;
    }

    public boolean getCcpDialogShowFlag() {
        return this.f10097b0;
    }

    public boolean getCcpDialogShowNameCode() {
        return this.f10102i0;
    }

    public boolean getCcpDialogShowTitle() {
        return this.f10096a0;
    }

    public int getContentColor() {
        return this.f10109p0;
    }

    public k getCurrentTextGravity() {
        return this.M;
    }

    public g getCustomDefaultLanguage() {
        return this.A0;
    }

    public List<com.hbb20.a> getCustomMasterCountriesList() {
        return this.f10121x0;
    }

    public String getCustomMasterCountriesParam() {
        return this.f10123y0;
    }

    public String getDefaultCountryCode() {
        return this.J.f10143v;
    }

    public int getDefaultCountryCodeAsInt() {
        try {
            return Integer.parseInt(getDefaultCountryCode());
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public String getDefaultCountryCodeWithPlus() {
        return "+" + getDefaultCountryCode();
    }

    public String getDefaultCountryName() {
        com.hbb20.a defaultCountry = getDefaultCountry();
        if (defaultCountry == null) {
            return "";
        }
        return defaultCountry.f10144w;
    }

    public String getDefaultCountryNameCode() {
        com.hbb20.a defaultCountry = getDefaultCountry();
        if (defaultCountry == null) {
            return "";
        }
        return defaultCountry.f10142u.toUpperCase(Locale.US);
    }

    public int getDialogBackgroundColor() {
        return this.S0;
    }

    public int getDialogBackgroundResId() {
        return this.R0;
    }

    public float getDialogCornerRadius() {
        return this.W0;
    }

    public e getDialogEventsListener() {
        return null;
    }

    public int getDialogSearchEditTextTintColor() {
        return this.U0;
    }

    public int getDialogTextColor() {
        return this.T0;
    }

    public String getDialogTitle() {
        String str;
        g languageToApply = getLanguageToApply();
        g gVar = com.hbb20.a.f10141z;
        if (gVar == null || gVar != languageToApply || (str = com.hbb20.a.A) == null || str.length() == 0) {
            com.hbb20.a.u(this.f10122y, languageToApply);
        }
        return com.hbb20.a.A;
    }

    public Typeface getDialogTypeFace() {
        return this.f10111r0;
    }

    public int getDialogTypeFaceStyle() {
        return this.f10112s0;
    }

    public EditText getEditText_registeredCarrierNumber() {
        return this.C;
    }

    public int getFastScrollerBubbleColor() {
        return this.f10119w0;
    }

    public int getFastScrollerBubbleTextAppearance() {
        return this.V0;
    }

    public int getFastScrollerHandleColor() {
        return this.Q0;
    }

    public String getFormattedFullNumber() {
        try {
            ds.g enteredPhoneNumber = getEnteredPhoneNumber();
            return "+" + getPhoneUtil().c(enteredPhoneNumber, 2).substring(1);
        } catch (NumberParseException unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getFullNumberWithPlus();
        }
    }

    public String getFullNumber() {
        try {
            return getPhoneUtil().c(getEnteredPhoneNumber(), 1).substring(1);
        } catch (NumberParseException unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getSelectedCountryCode() + ds.c.r(this.C.getText().toString());
        }
    }

    public String getFullNumberWithPlus() {
        return "+" + getFullNumber();
    }

    public RelativeLayout getHolder() {
        return this.D;
    }

    public ImageView getImageViewFlag() {
        return this.F;
    }

    public g getLanguageToApply() {
        if (this.B0 == null) {
            o();
        }
        return this.B0;
    }

    public String getNoResultACK() {
        String str;
        g languageToApply = getLanguageToApply();
        g gVar = com.hbb20.a.f10141z;
        if (gVar == null || gVar != languageToApply || (str = com.hbb20.a.C) == null || str.length() == 0) {
            com.hbb20.a.u(this.f10122y, languageToApply);
        }
        return com.hbb20.a.C;
    }

    public String getSearchHintText() {
        String str;
        g languageToApply = getLanguageToApply();
        g gVar = com.hbb20.a.f10141z;
        if (gVar == null || gVar != languageToApply || (str = com.hbb20.a.B) == null || str.length() == 0) {
            com.hbb20.a.u(this.f10122y, languageToApply);
        }
        return com.hbb20.a.B;
    }

    public String getSelectedCountryCode() {
        return getSelectedCountry().f10143v;
    }

    public int getSelectedCountryCodeAsInt() {
        try {
            return Integer.parseInt(getSelectedCountryCode());
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public String getSelectedCountryCodeWithPlus() {
        return "+" + getSelectedCountryCode();
    }

    public String getSelectedCountryEnglishName() {
        return getSelectedCountry().f10145x;
    }

    public int getSelectedCountryFlagResourceId() {
        return getSelectedCountry().f10146y;
    }

    public String getSelectedCountryName() {
        return getSelectedCountry().f10144w;
    }

    public String getSelectedCountryNameCode() {
        return getSelectedCountry().f10142u.toUpperCase(Locale.US);
    }

    public TextView getTextView_selectedCountry() {
        return this.B;
    }

    public final void h() {
        if (this.e0) {
            this.E.setVisibility(0);
        } else {
            this.E.setVisibility(8);
        }
    }

    public final void i() {
        String str = this.f10123y0;
        if (str != null && str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.f10123y0.split(",")) {
                com.hbb20.a k10 = com.hbb20.a.k(getContext(), getLanguageToApply(), str2);
                if (k10 != null && !c(k10, arrayList)) {
                    arrayList.add(k10);
                }
            }
            if (arrayList.size() == 0) {
                this.f10121x0 = null;
            } else {
                this.f10121x0 = arrayList;
            }
        } else {
            String str3 = this.f10125z0;
            if (str3 != null && str3.length() != 0) {
                this.f10125z0 = this.f10125z0.toLowerCase();
                ArrayList<com.hbb20.a> r = com.hbb20.a.r(this.f10122y, getLanguageToApply());
                ArrayList arrayList2 = new ArrayList();
                for (com.hbb20.a aVar : r) {
                    if (!this.f10125z0.contains(aVar.f10142u.toLowerCase())) {
                        arrayList2.add(aVar);
                    }
                }
                if (arrayList2.size() > 0) {
                    this.f10121x0 = arrayList2;
                } else {
                    this.f10121x0 = null;
                }
            } else {
                this.f10121x0 = null;
            }
        }
        List<com.hbb20.a> list = this.f10121x0;
        if (list != null) {
            for (com.hbb20.a aVar2 : list) {
                aVar2.v();
            }
        }
    }

    public final void j() {
        if (this.Q) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                this.K.setBackgroundResource(i6);
            } else {
                this.K.setBackgroundResource(typedValue.data);
            }
        }
    }

    public final void k() {
        String[] split;
        com.hbb20.a k10;
        String str = this.f10117v0;
        if (str != null && str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.f10117v0.split(",")) {
                Context context = getContext();
                List<com.hbb20.a> list = this.f10121x0;
                g languageToApply = getLanguageToApply();
                if (list != null && list.size() != 0) {
                    Iterator<com.hbb20.a> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            k10 = it.next();
                            if (k10.f10142u.equalsIgnoreCase(str2)) {
                                break;
                            }
                        } else {
                            k10 = null;
                            break;
                        }
                    }
                } else {
                    k10 = com.hbb20.a.k(context, languageToApply, str2);
                }
                if (k10 != null && !c(k10, arrayList)) {
                    arrayList.add(k10);
                }
            }
            if (arrayList.size() == 0) {
                this.f10113t0 = null;
            } else {
                this.f10113t0 = arrayList;
            }
        } else {
            this.f10113t0 = null;
        }
        ArrayList arrayList2 = this.f10113t0;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((com.hbb20.a) it2.next()).v();
            }
        }
    }

    public final void l(boolean z10) {
        this.U = z10;
        if (z10) {
            if (this.f10104k0) {
                this.H.setVisibility(8);
            } else {
                this.H.setVisibility(0);
            }
        } else {
            this.H.setVisibility(8);
        }
        if (!isInEditMode()) {
            setSelectedCountry(this.I);
        }
    }

    public final void m() {
        EditText editText = this.C;
        if (editText != null && this.I != null) {
            String r = ds.c.r(getEditText_registeredCarrierNumber().getText().toString());
            kg.h hVar = this.K0;
            if (hVar != null) {
                this.C.removeTextChangedListener(hVar);
            }
            TextWatcher textWatcher = this.L0;
            if (textWatcher != null) {
                this.C.removeTextChangedListener(textWatcher);
            }
            if (this.G0) {
                kg.h hVar2 = new kg.h(this.f10122y, getSelectedCountryNameCode(), getSelectedCountryCodeAsInt(), this.f10106m0);
                this.K0 = hVar2;
                this.C.addTextChangedListener(hVar2);
            }
            if (this.f10101h0) {
                TextWatcher countryDetectorTextWatcher = getCountryDetectorTextWatcher();
                this.L0 = countryDetectorTextWatcher;
                this.C.addTextChangedListener(countryDetectorTextWatcher);
            }
            this.C.setText("");
            this.C.setText(r);
            EditText editText2 = this.C;
            editText2.setSelection(editText2.getText().length());
        } else if (editText == null) {
            Log.v("CCP", "updateFormattingTextWatcher: EditText not registered " + this.f10108o0);
        } else {
            Log.v("CCP", "updateFormattingTextWatcher: selected country is null " + this.f10108o0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        ds.g t3;
        String str;
        if (this.C != null && this.H0) {
            ds.c phoneUtil = getPhoneUtil();
            String selectedCountryNameCode = getSelectedCountryNameCode();
            c.a selectedHintNumberType = getSelectedHintNumberType();
            boolean n10 = phoneUtil.n(selectedCountryNameCode);
            Logger logger = ds.c.f13277h;
            if (!n10) {
                logger.log(Level.WARNING, "Invalid or unknown region code provided: " + selectedCountryNameCode);
            } else {
                ds.f i6 = ds.c.i(phoneUtil.f(selectedCountryNameCode), selectedHintNumberType);
                try {
                } catch (NumberParseException e10) {
                    logger.log(Level.SEVERE, e10.toString());
                }
                if (i6.f13342y) {
                    t3 = phoneUtil.t(i6.f13343z, selectedCountryNameCode);
                    str = "";
                    if (t3 != null) {
                        str = PhoneNumberUtils.formatNumber(getSelectedCountryCodeWithPlus() + (t3.f13345v + ""), getSelectedCountryNameCode());
                        if (str != null) {
                            str = str.substring(getSelectedCountryCodeWithPlus().length()).trim();
                        }
                    }
                    if (str == null) {
                        str = this.N;
                    }
                    this.C.setHint(str);
                }
            }
            t3 = null;
            str = "";
            if (t3 != null) {
            }
            if (str == null) {
            }
            this.C.setHint(str);
        }
    }

    public final void o() {
        boolean isInEditMode = isInEditMode();
        g gVar = g.ENGLISH;
        if (isInEditMode) {
            g gVar2 = this.A0;
            if (gVar2 != null) {
                this.B0 = gVar2;
            } else {
                this.B0 = gVar;
            }
        } else if (this.E0) {
            g cCPLanguageFromLocale = getCCPLanguageFromLocale();
            if (cCPLanguageFromLocale == null) {
                if (getCustomDefaultLanguage() != null) {
                    this.B0 = getCustomDefaultLanguage();
                    return;
                } else {
                    this.B0 = gVar;
                    return;
                }
            }
            this.B0 = cCPLanguageFromLocale;
        } else if (getCustomDefaultLanguage() != null) {
            this.B0 = this.A0;
        } else {
            this.B0 = gVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Dialog dialog = com.hbb20.e.f10156d;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.hbb20.e.f10156d = null;
        com.hbb20.e.f10157e = null;
        super.onDetachedFromWindow();
    }

    public void setArrowColor(int i6) {
        this.f10110q0 = i6;
        if (i6 == -99) {
            int i10 = this.f10109p0;
            if (i10 != -99) {
                this.E.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        this.E.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
    }

    public void setArrowSize(int i6) {
        if (i6 > 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.width = i6;
            layoutParams.height = i6;
            this.E.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1 A[Catch: Exception -> 0x00cf, LOOP:0: B:57:0x0003->B:47:0x00b1, LOOP_END, TryCatch #0 {Exception -> 0x00cf, blocks: (B:3:0x0003, B:5:0x000d, B:19:0x004d, B:31:0x007b, B:43:0x00aa, B:47:0x00b1, B:50:0x00b9, B:9:0x001e, B:11:0x002e, B:13:0x0034, B:16:0x003c, B:21:0x0051, B:23:0x005d, B:25:0x0063, B:28:0x006a, B:33:0x007f, B:35:0x008b, B:37:0x0091, B:40:0x0098), top: B:57:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAutoDetectedCountry(boolean z10) {
        String simCountryIso;
        String networkCountryIso;
        String country;
        boolean z11 = false;
        for (int i6 = 0; i6 < this.O.f10131u.length(); i6++) {
            try {
                char charAt = this.O.f10131u.charAt(i6);
                Context context = this.f10122y;
                switch (charAt) {
                    case com.appsflyer.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        try {
                            simCountryIso = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        if (simCountryIso != null && !simCountryIso.isEmpty() && d(simCountryIso)) {
                            setSelectedCountry(com.hbb20.a.k(getContext(), getLanguageToApply(), simCountryIso));
                            z11 = true;
                            if (z11) {
                                if (z11 && z10) {
                                    com.hbb20.a k10 = com.hbb20.a.k(getContext(), getLanguageToApply(), getDefaultCountryNameCode());
                                    this.J = k10;
                                    setSelectedCountry(k10);
                                    return;
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                        break;
                    case '2':
                        try {
                            networkCountryIso = ((TelephonyManager) context.getSystemService("phone")).getNetworkCountryIso();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (networkCountryIso != null && !networkCountryIso.isEmpty() && d(networkCountryIso)) {
                            setSelectedCountry(com.hbb20.a.k(getContext(), getLanguageToApply(), networkCountryIso));
                            z11 = true;
                            if (z11) {
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                        break;
                    case com.appsflyer.R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        try {
                            country = context.getResources().getConfiguration().locale.getCountry();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                        if (country != null && !country.isEmpty() && d(country)) {
                            setSelectedCountry(com.hbb20.a.k(getContext(), getLanguageToApply(), country));
                            z11 = true;
                            if (z11) {
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                        break;
                    default:
                        if (z11) {
                        }
                        break;
                }
            } catch (Exception e13) {
                e13.printStackTrace();
                Log.w("CCP", "setAutoDetectCountry: Exception" + e13.getMessage());
                if (z10) {
                    com.hbb20.a k11 = com.hbb20.a.k(getContext(), getLanguageToApply(), getDefaultCountryNameCode());
                    this.J = k11;
                    setSelectedCountry(k11);
                    return;
                }
                return;
            }
        }
        if (z11) {
        }
    }

    public void setCcpClickable(boolean z10) {
        this.D0 = z10;
        if (!z10) {
            this.K.setOnClickListener(null);
            this.K.setClickable(false);
            this.K.setEnabled(false);
            return;
        }
        this.K.setOnClickListener(this.Y0);
        this.K.setClickable(true);
        this.K.setEnabled(true);
    }

    public void setCcpDialogRippleEnable(boolean z10) {
        this.c0 = z10;
    }

    public void setCcpDialogShowFlag(boolean z10) {
        this.f10097b0 = z10;
    }

    public void setCcpDialogShowNameCode(boolean z10) {
        this.f10102i0 = z10;
    }

    public void setCcpDialogShowPhoneCode(boolean z10) {
        this.T = z10;
    }

    public void setCcpDialogShowTitle(boolean z10) {
        this.f10096a0 = z10;
    }

    public void setContentColor(int i6) {
        this.f10109p0 = i6;
        this.B.setTextColor(i6);
        if (this.f10110q0 == -99) {
            this.E.setColorFilter(this.f10109p0, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setCountryAutoDetectionPref(c cVar) {
        this.O = cVar;
    }

    public void setCountryForNameCode(String str) {
        com.hbb20.a k10 = com.hbb20.a.k(getContext(), getLanguageToApply(), str);
        if (k10 == null) {
            if (this.J == null) {
                this.J = com.hbb20.a.h(getContext(), getLanguageToApply(), this.f10113t0, this.f10118w);
            }
            setSelectedCountry(this.J);
            return;
        }
        setSelectedCountry(k10);
    }

    public void setCountryForPhoneCode(int i6) {
        com.hbb20.a h10 = com.hbb20.a.h(getContext(), getLanguageToApply(), this.f10113t0, i6);
        if (h10 == null) {
            if (this.J == null) {
                this.J = com.hbb20.a.h(getContext(), getLanguageToApply(), this.f10113t0, this.f10118w);
            }
            setSelectedCountry(this.J);
            return;
        }
        setSelectedCountry(h10);
    }

    public void setCountryPreference(String str) {
        this.f10117v0 = str;
    }

    public void setCurrentTextGravity(k kVar) {
        this.M = kVar;
        int i6 = kVar.f10140u;
        if (i6 == -1) {
            this.B.setGravity(3);
        } else if (i6 == 0) {
            this.B.setGravity(17);
        } else {
            this.B.setGravity(5);
        }
    }

    public void setCustomMasterCountries(String str) {
        this.f10123y0 = str;
    }

    public void setCustomMasterCountriesList(List<com.hbb20.a> list) {
        this.f10121x0 = list;
    }

    public void setDefaultCountryUsingNameCode(String str) {
        com.hbb20.a k10 = com.hbb20.a.k(getContext(), getLanguageToApply(), str);
        if (k10 != null) {
            this.f10120x = k10.f10142u;
            setDefaultCountry(k10);
        }
    }

    @Deprecated
    public void setDefaultCountryUsingPhoneCode(int i6) {
        com.hbb20.a h10 = com.hbb20.a.h(getContext(), getLanguageToApply(), this.f10113t0, i6);
        if (h10 != null) {
            this.f10118w = i6;
            setDefaultCountry(h10);
        }
    }

    public void setDetectCountryWithAreaCode(boolean z10) {
        this.f10101h0 = z10;
        m();
    }

    public void setDialogBackground(int i6) {
        this.R0 = i6;
    }

    public void setDialogBackgroundColor(int i6) {
        this.S0 = i6;
    }

    public void setDialogCornerRaius(float f2) {
        this.W0 = f2;
    }

    public void setDialogKeyboardAutoPopup(boolean z10) {
        this.C0 = z10;
    }

    public void setDialogSearchEditTextTintColor(int i6) {
        this.U0 = i6;
    }

    public void setDialogTextColor(int i6) {
        this.T0 = i6;
    }

    public void setDialogTypeFace(Typeface typeface) {
        try {
            this.f10111r0 = typeface;
            this.f10112s0 = -99;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setEditText_registeredCarrierNumber(EditText editText) {
        this.C = editText;
        if (editText.getHint() != null) {
            this.N = this.C.getHint().toString();
        }
        try {
            this.C.removeTextChangedListener(this.J0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        e();
        com.hbb20.f fVar = new com.hbb20.f(this);
        this.J0 = fVar;
        this.C.addTextChangedListener(fVar);
        m();
        n();
    }

    public void setExcludedCountries(String str) {
        this.f10125z0 = str;
        i();
    }

    public void setFastScrollerBubbleColor(int i6) {
        this.f10119w0 = i6;
    }

    public void setFastScrollerBubbleTextAppearance(int i6) {
        this.V0 = i6;
    }

    public void setFastScrollerHandleColor(int i6) {
        this.Q0 = i6;
    }

    public void setFlagBorderColor(int i6) {
        this.G.setBackgroundColor(i6);
    }

    public void setFlagSize(int i6) {
        this.F.getLayoutParams().height = i6;
        this.F.requestLayout();
    }

    public void setFullNumber(String str) {
        int indexOf;
        com.hbb20.b bVar;
        Context context = getContext();
        g languageToApply = getLanguageToApply();
        ArrayList arrayList = this.f10113t0;
        com.hbb20.a aVar = null;
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                int i6 = 0;
                if (trim.charAt(0) == '+') {
                    i6 = 1;
                }
                int i10 = i6;
                while (true) {
                    if (i10 > trim.length()) {
                        break;
                    }
                    String substring = trim.substring(i6, i10);
                    try {
                        bVar = com.hbb20.b.b(Integer.parseInt(substring));
                    } catch (Exception unused) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        int length = substring.length() + i6;
                        int length2 = trim.length();
                        int i11 = bVar.f10149b + length;
                        aVar = length2 >= i11 ? bVar.a(context, languageToApply, trim.substring(length, i11)) : com.hbb20.a.k(context, languageToApply, bVar.f10148a);
                    } else {
                        com.hbb20.a f2 = com.hbb20.a.f(context, languageToApply, substring, arrayList);
                        if (f2 != null) {
                            aVar = f2;
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        if (aVar == null) {
            aVar = getDefaultCountry();
        }
        setSelectedCountry(aVar);
        if (aVar != null && str != null && !str.isEmpty() && (indexOf = str.indexOf(aVar.f10143v)) != -1) {
            str = str.substring(aVar.f10143v.length() + indexOf);
        }
        if (getEditText_registeredCarrierNumber() != null) {
            getEditText_registeredCarrierNumber().setText(str);
            m();
            return;
        }
        Log.w("CCP", "EditText for carrier number is not registered. Register it using registerCarrierNumberEditText() before getFullNumber() or setFullNumber().");
    }

    public void setHintExampleNumberEnabled(boolean z10) {
        this.H0 = z10;
        n();
    }

    public void setHintExampleNumberType(i iVar) {
        this.f10107n0 = iVar;
        n();
    }

    public void setImageViewFlag(ImageView imageView) {
        this.F = imageView;
    }

    public void setInternationalFormattingOnly(boolean z10) {
        this.f10106m0 = z10;
        if (this.C != null) {
            m();
        }
    }

    public void setLanguageToApply(g gVar) {
        this.B0 = gVar;
    }

    public void setNumberAutoFormattingEnabled(boolean z10) {
        this.G0 = z10;
        if (this.C != null) {
            m();
        }
    }

    public void setPhoneNumberValidityChangeListener(j jVar) {
        if (this.C != null && jVar != null) {
            e();
            jVar.a();
        }
    }

    public void setSearchAllowed(boolean z10) {
        this.f10098d0 = z10;
    }

    public void setSelectedCountry(com.hbb20.a aVar) {
        kg.a aVar2 = this.f10114u;
        if (aVar2 != null && ((df.b) aVar2).r(aVar) != null) {
            this.B.setContentDescription(((df.b) this.f10114u).r(aVar));
        }
        this.M0 = false;
        String str = "";
        this.N0 = "";
        if (aVar == null && (aVar = com.hbb20.a.h(getContext(), getLanguageToApply(), this.f10113t0, this.f10118w)) == null) {
            return;
        }
        this.I = aVar;
        if (this.U && this.f10104k0) {
            str = isInEditMode() ? this.f10105l0 ? "🏁\u200b " : com.hbb20.a.l(aVar).concat("\u200b ") : com.hbb20.a.l(aVar).concat("  ");
        }
        if (this.V) {
            StringBuilder c10 = v.h.c(str);
            c10.append(aVar.f10144w);
            str = c10.toString();
        }
        if (this.R) {
            if (this.V) {
                StringBuilder d10 = v.g.d(str, " (");
                d10.append(aVar.f10142u.toUpperCase(Locale.US));
                d10.append(")");
                str = d10.toString();
            } else {
                StringBuilder d11 = v.g.d(str, " ");
                d11.append(aVar.f10142u.toUpperCase(Locale.US));
                str = d11.toString();
            }
        }
        if (this.S) {
            if (str.length() > 0) {
                str = str.concat("  ");
            }
            StringBuilder d12 = v.g.d(str, "+");
            d12.append(aVar.f10143v);
            str = d12.toString();
        }
        this.B.setText(str);
        if (!this.U && str.length() == 0) {
            StringBuilder d13 = v.g.d(str, "+");
            d13.append(aVar.f10143v);
            this.B.setText(d13.toString());
        }
        ImageView imageView = this.F;
        if (aVar.f10146y == -99) {
            aVar.f10146y = com.hbb20.a.n(aVar);
        }
        imageView.setImageResource(aVar.f10146y);
        m();
        n();
        EditText editText = this.C;
        this.M0 = true;
        if (this.P0) {
            try {
                editText.setSelection(this.O0);
                this.P0 = false;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.X0 = com.hbb20.b.b(getSelectedCountryCodeAsInt());
    }

    public void setShowFastScroller(boolean z10) {
        this.W = z10;
    }

    public void setShowPhoneCode(boolean z10) {
        this.S = z10;
        setSelectedCountry(this.I);
    }

    public void setTalkBackTextProvider(kg.a aVar) {
        this.f10114u = aVar;
        setSelectedCountry(this.I);
    }

    public void setTextSize(int i6) {
        if (i6 > 0) {
            this.B.setTextSize(0, i6);
            setArrowSize(i6);
            setFlagSize(i6);
        }
    }

    public void setTextView_selectedCountry(TextView textView) {
        this.B = textView;
    }

    public void setTypeFace(Typeface typeface) {
        try {
            this.B.setTypeface(typeface);
            setDialogTypeFace(typeface);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        /* JADX INFO: Fake field, exist only in values array */
        AFRIKAANS("af"),
        /* JADX INFO: Fake field, exist only in values array */
        ARABIC("ar"),
        /* JADX INFO: Fake field, exist only in values array */
        BASQUE("eu"),
        /* JADX INFO: Fake field, exist only in values array */
        BENGALI("bn"),
        /* JADX INFO: Fake field, exist only in values array */
        CHINESE_SIMPLIFIED(4, "Hans"),
        /* JADX INFO: Fake field, exist only in values array */
        CHINESE_TRADITIONAL(5, "Hant"),
        /* JADX INFO: Fake field, exist only in values array */
        CZECH("cs"),
        /* JADX INFO: Fake field, exist only in values array */
        DANISH("da"),
        /* JADX INFO: Fake field, exist only in values array */
        DUTCH("nl"),
        ENGLISH("en"),
        /* JADX INFO: Fake field, exist only in values array */
        FARSI("fa"),
        /* JADX INFO: Fake field, exist only in values array */
        FRENCH("fr"),
        /* JADX INFO: Fake field, exist only in values array */
        GERMAN("de"),
        /* JADX INFO: Fake field, exist only in values array */
        GREEK("el"),
        /* JADX INFO: Fake field, exist only in values array */
        GUJARATI("gu"),
        /* JADX INFO: Fake field, exist only in values array */
        HEBREW("iw"),
        /* JADX INFO: Fake field, exist only in values array */
        HINDI("hi"),
        /* JADX INFO: Fake field, exist only in values array */
        HUNGARIAN("hu"),
        /* JADX INFO: Fake field, exist only in values array */
        INDONESIA("in"),
        /* JADX INFO: Fake field, exist only in values array */
        ITALIAN("it"),
        /* JADX INFO: Fake field, exist only in values array */
        JAPANESE("ja"),
        /* JADX INFO: Fake field, exist only in values array */
        KAZAKH("kk"),
        /* JADX INFO: Fake field, exist only in values array */
        KOREAN("ko"),
        /* JADX INFO: Fake field, exist only in values array */
        MARATHI("mr"),
        /* JADX INFO: Fake field, exist only in values array */
        POLISH("pl"),
        /* JADX INFO: Fake field, exist only in values array */
        PORTUGUESE("pt"),
        /* JADX INFO: Fake field, exist only in values array */
        PUNJABI("pa"),
        /* JADX INFO: Fake field, exist only in values array */
        RUSSIAN("ru"),
        /* JADX INFO: Fake field, exist only in values array */
        SERBIAN("sr"),
        /* JADX INFO: Fake field, exist only in values array */
        SLOVAK("sk"),
        /* JADX INFO: Fake field, exist only in values array */
        SLOVENIAN("si"),
        /* JADX INFO: Fake field, exist only in values array */
        SPANISH("es"),
        /* JADX INFO: Fake field, exist only in values array */
        SWEDISH("sv"),
        /* JADX INFO: Fake field, exist only in values array */
        TAGALOG("tl"),
        /* JADX INFO: Fake field, exist only in values array */
        THAI("th"),
        /* JADX INFO: Fake field, exist only in values array */
        TURKISH("tr"),
        /* JADX INFO: Fake field, exist only in values array */
        UKRAINIAN("uk"),
        /* JADX INFO: Fake field, exist only in values array */
        URDU("ur"),
        /* JADX INFO: Fake field, exist only in values array */
        UZBEK("uz"),
        /* JADX INFO: Fake field, exist only in values array */
        VIETNAMESE("vi");
        

        /* renamed from: u  reason: collision with root package name */
        public final String f10134u;

        /* renamed from: v  reason: collision with root package name */
        public final String f10135v;

        /* renamed from: w  reason: collision with root package name */
        public final String f10136w;

        g(int i6, String str) {
            this.f10134u = "zh";
            this.f10135v = r2;
            this.f10136w = str;
        }

        g(String str) {
            this.f10134u = str;
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextWatcher {

        /* renamed from: u  reason: collision with root package name */
        public String f10127u = null;

        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            CountryCodePicker countryCodePicker = CountryCodePicker.this;
            com.hbb20.a selectedCountry = countryCodePicker.getSelectedCountry();
            if (selectedCountry != null) {
                String str = this.f10127u;
                if ((str == null || !str.equals(charSequence.toString())) && countryCodePicker.M0) {
                    if (countryCodePicker.X0 != null) {
                        String obj = countryCodePicker.getEditText_registeredCarrierNumber().getText().toString();
                        if (obj.length() >= countryCodePicker.X0.f10149b) {
                            String r = ds.c.r(obj);
                            int length = r.length();
                            int i12 = countryCodePicker.X0.f10149b;
                            if (length >= i12) {
                                String substring = r.substring(0, i12);
                                if (!substring.equals(countryCodePicker.N0)) {
                                    com.hbb20.a a10 = countryCodePicker.X0.a(countryCodePicker.f10122y, countryCodePicker.getLanguageToApply(), substring);
                                    if (!a10.equals(selectedCountry)) {
                                        countryCodePicker.P0 = true;
                                        countryCodePicker.O0 = Selection.getSelectionEnd(charSequence);
                                        countryCodePicker.setSelectedCountry(a10);
                                    }
                                    countryCodePicker.N0 = substring;
                                }
                            }
                        }
                    }
                    this.f10127u = charSequence.toString();
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }

    public void setAutoDetectionFailureListener(f fVar) {
    }

    public void setCustomDialogTextProvider(d dVar) {
    }

    public void setDialogEventsListener(e eVar) {
    }

    public void setOnCountryChangeListener(h hVar) {
    }
}
