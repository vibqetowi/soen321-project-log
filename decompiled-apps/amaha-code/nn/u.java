package nn;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CB11Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnn/u;", "Lrn/b;", "<init>", "()V", "a", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u extends rn.b {
    public int A;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f26608w = LogHelper.INSTANCE.makeLogTag(u.class);

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f26609x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<String> f26610y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<String> f26611z = new ArrayList<>();

    /* compiled from: CB11Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.e<C0435a> {
        public final LayoutInflater A;

        /* renamed from: x  reason: collision with root package name */
        public final ArrayList<String> f26612x;

        /* renamed from: y  reason: collision with root package name */
        public final Activity f26613y;

        /* renamed from: z  reason: collision with root package name */
        public final ss.l<Integer, hs.k> f26614z;

        /* compiled from: CB11Fragment.kt */
        /* renamed from: nn.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0435a extends RecyclerView.c0 {

            /* renamed from: u  reason: collision with root package name */
            public final AppCompatImageView f26615u;

            public C0435a(View view) {
                super(view);
                this.f26615u = (AppCompatImageView) view.findViewById(R.id.cbRowElement);
            }
        }

        public a(ArrayList imageList, androidx.fragment.app.p pVar, b bVar) {
            kotlin.jvm.internal.i.g(imageList, "imageList");
            this.f26612x = imageList;
            this.f26613y = pVar;
            this.f26614z = bVar;
            Object systemService = pVar.getSystemService("layout_inflater");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            this.A = (LayoutInflater) systemService;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return this.f26612x.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void n(C0435a c0435a, int i6) {
            C0435a c0435a2 = c0435a;
            Activity activity = this.f26613y;
            try {
                String str = (String) is.u.j2(i6, this.f26612x);
                AppCompatImageView appCompatImageView = c0435a2.f26615u;
                if (str != null) {
                    Glide.f(activity).d(new File(activity.getFilesDir(), str)).B(appCompatImageView);
                }
                appCompatImageView.setOnClickListener(new ak.d(i6, 13, this));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("CB11Adapter", e10);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView parent) {
            kotlin.jvm.internal.i.g(parent, "parent");
            View inflate = this.A.inflate(R.layout.row_cb11_recycler_holder, (ViewGroup) parent, false);
            kotlin.jvm.internal.i.f(inflate, "inflater.inflate(R.layou…er_holder, parent, false)");
            return new C0435a(inflate);
        }
    }

    /* compiled from: CB11Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Integer num) {
            int intValue = num.intValue();
            RecyclerView recyclerView = (RecyclerView) u.this._$_findCachedViewById(R.id.cb11Recycler);
            if (recyclerView != null) {
                recyclerView.l0(intValue);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: CB11Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.r {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f26618b;

        public c(d dVar) {
            this.f26618b = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i6, RecyclerView recyclerView) {
            View d10;
            kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
            if (i6 == 0) {
                u uVar = u.this;
                int i10 = uVar.A;
                d dVar = this.f26618b;
                dVar.getClass();
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                int i11 = -1;
                if (layoutManager != null && (d10 = dVar.d(layoutManager)) != null) {
                    i11 = layoutManager.getPosition(d10);
                }
                uVar.A = i11;
                int i12 = uVar.A;
                if (i10 != i12) {
                    uVar.getClass();
                    try {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) uVar._$_findCachedViewById(R.id.cb11DescTitle), "alpha", 1.0f, 0.0f);
                        ofFloat.setDuration(350L);
                        ofFloat.addListener(new v(uVar, ofFloat, i12));
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((RobertoTextView) uVar._$_findCachedViewById(R.id.cb11DescBody), "alpha", 1.0f, 0.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((RobertoTextView) uVar._$_findCachedViewById(R.id.cb11DescBody), "alpha", 0.0f, 1.0f);
                        ofFloat2.setDuration(350L);
                        ofFloat3.setDuration(350L);
                        ofFloat2.addListener(new w(uVar, ofFloat3, ofFloat2, i12));
                        ofFloat.start();
                        ofFloat2.start();
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(uVar.f26608w, e10);
                    }
                }
            }
        }
    }

    /* compiled from: CB11Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends androidx.recyclerview.widget.r {
        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.c0
        public final int[] b(RecyclerView.m layoutManager, View targetView) {
            kotlin.jvm.internal.i.g(layoutManager, "layoutManager");
            kotlin.jvm.internal.i.g(targetView, "targetView");
            int[] iArr = new int[2];
            if (layoutManager.canScrollHorizontally()) {
                new Rect();
                iArr[0] = (layoutManager.getDecoratedLeft(targetView) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) targetView.getLayoutParams())).leftMargin) - layoutManager.getPaddingLeft();
            } else {
                iArr[0] = 0;
            }
            if (layoutManager.canScrollVertically()) {
                new Rect();
                iArr[1] = (layoutManager.getDecoratedTop(targetView) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) targetView.getLayoutParams())).topMargin) - layoutManager.getPaddingTop();
            } else {
                iArr[1] = 0;
            }
            return iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e7, code lost:
        r6 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063 A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093 A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6 A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3 A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3 A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea A[Catch: Exception -> 0x011e, TRY_LEAVE, TryCatch #0 {Exception -> 0x011e, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:18:0x0026, B:19:0x002f, B:21:0x0037, B:30:0x0047, B:31:0x005b, B:33:0x0063, B:43:0x0076, B:47:0x0088, B:48:0x008b, B:50:0x0093, B:60:0x00a6, B:64:0x00b8, B:65:0x00bb, B:67:0x00c3, B:76:0x00d3, B:77:0x00d5, B:79:0x00dd, B:86:0x00ea), top: B:91:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z10;
        String str;
        String string;
        boolean z11;
        ArrayList<String> stringArrayList;
        boolean z12;
        ArrayList<String> stringArrayList2;
        boolean z13;
        ArrayList<String> stringArrayList3;
        boolean z14;
        String string2;
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string3 = arguments.getString("cb11_title", "");
                boolean z15 = true;
                if (string3 != null && string3.length() != 0) {
                    z10 = false;
                    str = null;
                    if (!z10) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.cb11Title)).setText(string3);
                    }
                    string = arguments.getString("cb11_pointer_color", "");
                    if (string != null && string.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            string = null;
                        }
                        if (string != null) {
                            ((AppCompatImageView) _$_findCachedViewById(R.id.cb11Arrow)).setImageTintList(ColorStateList.valueOf(Color.parseColor(string)));
                        }
                        stringArrayList = arguments.getStringArrayList("cb11_icon_title_list");
                        if (stringArrayList != null && !stringArrayList.isEmpty()) {
                            z12 = false;
                            if (!z12) {
                                stringArrayList = null;
                            }
                            if (stringArrayList != null) {
                                this.f26610y = stringArrayList;
                                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.cb11DescTitle);
                                String str2 = (String) is.u.j2(0, stringArrayList);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                robertoTextView.setText(str2);
                            }
                            stringArrayList2 = arguments.getStringArrayList("cb11_icon_desc_list");
                            if (stringArrayList2 != null && !stringArrayList2.isEmpty()) {
                                z13 = false;
                                if (!z13) {
                                    stringArrayList2 = null;
                                }
                                if (stringArrayList2 != null) {
                                    this.f26611z = stringArrayList2;
                                    RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.cb11DescBody);
                                    String str3 = (String) is.u.j2(0, stringArrayList2);
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    robertoTextView2.setText(str3);
                                }
                                stringArrayList3 = arguments.getStringArrayList("cb11_icon_list");
                                if (stringArrayList3 != null && !stringArrayList3.isEmpty()) {
                                    z14 = false;
                                    if (!z14) {
                                        stringArrayList3 = null;
                                    }
                                    if (stringArrayList3 != null) {
                                        this.f26609x = stringArrayList3;
                                    }
                                    string2 = arguments.getString("template_colour", "");
                                    if (string2 != null && string2.length() != 0) {
                                        z15 = false;
                                    }
                                    if (str == null) {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.cb11Title)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                        ((RobertoTextView) _$_findCachedViewById(R.id.cb11DescTitle)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                        ((RobertoTextView) _$_findCachedViewById(R.id.cb11DescBody)).setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
                                        return;
                                    }
                                    return;
                                }
                                z14 = true;
                                if (!z14) {
                                }
                                if (stringArrayList3 != null) {
                                }
                                string2 = arguments.getString("template_colour", "");
                                if (string2 != null) {
                                    z15 = false;
                                }
                                if (str == null) {
                                }
                            }
                            z13 = true;
                            if (!z13) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            stringArrayList3 = arguments.getStringArrayList("cb11_icon_list");
                            if (stringArrayList3 != null) {
                                z14 = false;
                                if (!z14) {
                                }
                                if (stringArrayList3 != null) {
                                }
                                string2 = arguments.getString("template_colour", "");
                                if (string2 != null) {
                                }
                                if (str == null) {
                                }
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (stringArrayList3 != null) {
                            }
                            string2 = arguments.getString("template_colour", "");
                            if (string2 != null) {
                            }
                            if (str == null) {
                            }
                        }
                        z12 = true;
                        if (!z12) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb11_icon_desc_list");
                        if (stringArrayList2 != null) {
                            z13 = false;
                            if (!z13) {
                            }
                            if (stringArrayList2 != null) {
                            }
                            stringArrayList3 = arguments.getStringArrayList("cb11_icon_list");
                            if (stringArrayList3 != null) {
                            }
                            z14 = true;
                            if (!z14) {
                            }
                            if (stringArrayList3 != null) {
                            }
                            string2 = arguments.getString("template_colour", "");
                            if (string2 != null) {
                            }
                            if (str == null) {
                            }
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("cb11_icon_list");
                        if (stringArrayList3 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (stringArrayList3 != null) {
                        }
                        string2 = arguments.getString("template_colour", "");
                        if (string2 != null) {
                        }
                        if (str == null) {
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb11_icon_title_list");
                    if (stringArrayList != null) {
                        z12 = false;
                        if (!z12) {
                        }
                        if (stringArrayList != null) {
                        }
                        stringArrayList2 = arguments.getStringArrayList("cb11_icon_desc_list");
                        if (stringArrayList2 != null) {
                        }
                        z13 = true;
                        if (!z13) {
                        }
                        if (stringArrayList2 != null) {
                        }
                        stringArrayList3 = arguments.getStringArrayList("cb11_icon_list");
                        if (stringArrayList3 != null) {
                        }
                        z14 = true;
                        if (!z14) {
                        }
                        if (stringArrayList3 != null) {
                        }
                        string2 = arguments.getString("template_colour", "");
                        if (string2 != null) {
                        }
                        if (str == null) {
                        }
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb11_icon_desc_list");
                    if (stringArrayList2 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("cb11_icon_list");
                    if (stringArrayList3 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (stringArrayList3 != null) {
                    }
                    string2 = arguments.getString("template_colour", "");
                    if (string2 != null) {
                    }
                    if (str == null) {
                    }
                }
                z10 = true;
                str = null;
                if (!z10) {
                }
                if (string3 != null) {
                }
                string = arguments.getString("cb11_pointer_color", "");
                if (string != null) {
                    z11 = false;
                    if (!z11) {
                    }
                    if (string != null) {
                    }
                    stringArrayList = arguments.getStringArrayList("cb11_icon_title_list");
                    if (stringArrayList != null) {
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    if (stringArrayList != null) {
                    }
                    stringArrayList2 = arguments.getStringArrayList("cb11_icon_desc_list");
                    if (stringArrayList2 != null) {
                    }
                    z13 = true;
                    if (!z13) {
                    }
                    if (stringArrayList2 != null) {
                    }
                    stringArrayList3 = arguments.getStringArrayList("cb11_icon_list");
                    if (stringArrayList3 != null) {
                    }
                    z14 = true;
                    if (!z14) {
                    }
                    if (stringArrayList3 != null) {
                    }
                    string2 = arguments.getString("template_colour", "");
                    if (string2 != null) {
                    }
                    if (str == null) {
                    }
                }
                z11 = true;
                if (!z11) {
                }
                if (string != null) {
                }
                stringArrayList = arguments.getStringArrayList("cb11_icon_title_list");
                if (stringArrayList != null) {
                }
                z12 = true;
                if (!z12) {
                }
                if (stringArrayList != null) {
                }
                stringArrayList2 = arguments.getStringArrayList("cb11_icon_desc_list");
                if (stringArrayList2 != null) {
                }
                z13 = true;
                if (!z13) {
                }
                if (stringArrayList2 != null) {
                }
                stringArrayList3 = arguments.getStringArrayList("cb11_icon_list");
                if (stringArrayList3 != null) {
                }
                z14 = true;
                if (!z14) {
                }
                if (stringArrayList3 != null) {
                }
                string2 = arguments.getString("template_colour", "");
                if (string2 != null) {
                }
                if (str == null) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26608w, e10);
        }
    }

    public final void J() {
        try {
            if (getActivity() != null) {
                ((RecyclerView) _$_findCachedViewById(R.id.cb11Recycler)).setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
                ArrayList<String> arrayList = this.f26609x;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                ((RecyclerView) _$_findCachedViewById(R.id.cb11Recycler)).setAdapter(new a(arrayList, activity, new b()));
                d dVar = new d();
                dVar.a((RecyclerView) _$_findCachedViewById(R.id.cb11Recycler));
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.cb11Recycler);
                if (recyclerView != null) {
                    recyclerView.i(new c(dVar));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26608w, e10);
        }
    }

    @Override // rn.b
    public final void _$_clearFindViewByIdCache() {
        this.B.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_cb11, viewGroup, false);
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rn.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            I();
            J();
            F().U();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26608w, e10);
        }
    }
}
