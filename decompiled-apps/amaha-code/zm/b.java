package zm;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.r;
import is.u;
import java.util.ArrayList;
import ss.q;
import ss.t;
/* compiled from: LibraryAllCollectionsAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {
    public final ArrayList<LibraryCollection> A;

    /* renamed from: x  reason: collision with root package name */
    public final t<String, Integer, Boolean, String, Boolean, LibraryCollection, hs.k> f39610x;

    /* renamed from: y  reason: collision with root package name */
    public final q<Integer, String, Boolean, hs.k> f39611y;

    /* renamed from: z  reason: collision with root package name */
    public final String f39612z = LogHelper.INSTANCE.makeLogTag("AllCollectionsAdapter");

    /* compiled from: LibraryAllCollectionsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final AppCompatImageView A;
        public final AppCompatImageView B;
        public final View C;
        public final View D;
        public final View E;

        /* renamed from: u  reason: collision with root package name */
        public final MotionLayout f39613u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f39614v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f39615w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f39616x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f39617y;

        /* renamed from: z  reason: collision with root package name */
        public final ChipGroup f39618z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.clRowAcContainer);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.clRowAcContainer)");
            this.f39613u = (MotionLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowAcHeader);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.tvRowAcHeader)");
            this.f39614v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRowAcSubHeader);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.tvRowAcSubHeader)");
            this.f39615w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowAcDescription);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.tvRowAcDescription)");
            this.f39616x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvRowAcCtaText);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.tvRowAcCtaText)");
            this.f39617y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.cgAcFilters);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.cgAcFilters)");
            this.f39618z = (ChipGroup) findViewById6;
            View findViewById7 = view.findViewById(R.id.tvRowAcImage);
            kotlin.jvm.internal.i.f(findViewById7, "view.findViewById(R.id.tvRowAcImage)");
            this.A = (AppCompatImageView) findViewById7;
            View findViewById8 = view.findViewById(R.id.ivRowAcDescriptionIcon2);
            kotlin.jvm.internal.i.f(findViewById8, "view.findViewById(R.id.ivRowAcDescriptionIcon2)");
            this.B = (AppCompatImageView) findViewById8;
            View findViewById9 = view.findViewById(R.id.clRowAcCtaContainer);
            kotlin.jvm.internal.i.f(findViewById9, "view.findViewById(R.id.clRowAcCtaContainer)");
            this.C = findViewById9;
            View findViewById10 = view.findViewById(R.id.viewRowAcBackground);
            kotlin.jvm.internal.i.f(findViewById10, "view.findViewById(R.id.viewRowAcBackground)");
            this.D = findViewById10;
            View findViewById11 = view.findViewById(R.id.viewRowAcAnimationClick);
            kotlin.jvm.internal.i.f(findViewById11, "view.findViewById(R.id.viewRowAcAnimationClick)");
            this.E = findViewById11;
        }
    }

    public b(ArrayList arrayList, t tVar, q qVar) {
        this.f39610x = tVar;
        this.f39611y = qVar;
        ArrayList<LibraryCollection> arrayList2 = new ArrayList<>();
        this.A = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.A.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0022, B:15:0x0036, B:17:0x0048, B:24:0x005c, B:26:0x006e, B:33:0x0082, B:35:0x0094, B:41:0x00a7, B:44:0x00ba, B:46:0x00cf, B:48:0x00d3, B:49:0x00ff, B:51:0x010d, B:59:0x011c, B:60:0x012f, B:62:0x013d, B:70:0x014c, B:71:0x0159, B:73:0x0165, B:79:0x0171, B:80:0x017e, B:84:0x0198, B:85:0x019c), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0022, B:15:0x0036, B:17:0x0048, B:24:0x005c, B:26:0x006e, B:33:0x0082, B:35:0x0094, B:41:0x00a7, B:44:0x00ba, B:46:0x00cf, B:48:0x00d3, B:49:0x00ff, B:51:0x010d, B:59:0x011c, B:60:0x012f, B:62:0x013d, B:70:0x014c, B:71:0x0159, B:73:0x0165, B:79:0x0171, B:80:0x017e, B:84:0x0198, B:85:0x019c), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0022, B:15:0x0036, B:17:0x0048, B:24:0x005c, B:26:0x006e, B:33:0x0082, B:35:0x0094, B:41:0x00a7, B:44:0x00ba, B:46:0x00cf, B:48:0x00d3, B:49:0x00ff, B:51:0x010d, B:59:0x011c, B:60:0x012f, B:62:0x013d, B:70:0x014c, B:71:0x0159, B:73:0x0165, B:79:0x0171, B:80:0x017e, B:84:0x0198, B:85:0x019c), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[Catch: Exception -> 0x01a1, TRY_ENTER, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0022, B:15:0x0036, B:17:0x0048, B:24:0x005c, B:26:0x006e, B:33:0x0082, B:35:0x0094, B:41:0x00a7, B:44:0x00ba, B:46:0x00cf, B:48:0x00d3, B:49:0x00ff, B:51:0x010d, B:59:0x011c, B:60:0x012f, B:62:0x013d, B:70:0x014c, B:71:0x0159, B:73:0x0165, B:79:0x0171, B:80:0x017e, B:84:0x0198, B:85:0x019c), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[Catch: Exception -> 0x01a1, LOOP:0: B:47:0x00d1->B:48:0x00d3, LOOP_END, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0022, B:15:0x0036, B:17:0x0048, B:24:0x005c, B:26:0x006e, B:33:0x0082, B:35:0x0094, B:41:0x00a7, B:44:0x00ba, B:46:0x00cf, B:48:0x00d3, B:49:0x00ff, B:51:0x010d, B:59:0x011c, B:60:0x012f, B:62:0x013d, B:70:0x014c, B:71:0x0159, B:73:0x0165, B:79:0x0171, B:80:0x017e, B:84:0x0198, B:85:0x019c), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0022, B:15:0x0036, B:17:0x0048, B:24:0x005c, B:26:0x006e, B:33:0x0082, B:35:0x0094, B:41:0x00a7, B:44:0x00ba, B:46:0x00cf, B:48:0x00d3, B:49:0x00ff, B:51:0x010d, B:59:0x011c, B:60:0x012f, B:62:0x013d, B:70:0x014c, B:71:0x0159, B:73:0x0165, B:79:0x0171, B:80:0x017e, B:84:0x0198, B:85:0x019c), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0022, B:15:0x0036, B:17:0x0048, B:24:0x005c, B:26:0x006e, B:33:0x0082, B:35:0x0094, B:41:0x00a7, B:44:0x00ba, B:46:0x00cf, B:48:0x00d3, B:49:0x00ff, B:51:0x010d, B:59:0x011c, B:60:0x012f, B:62:0x013d, B:70:0x014c, B:71:0x0159, B:73:0x0165, B:79:0x0171, B:80:0x017e, B:84:0x0198, B:85:0x019c), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0022, B:15:0x0036, B:17:0x0048, B:24:0x005c, B:26:0x006e, B:33:0x0082, B:35:0x0094, B:41:0x00a7, B:44:0x00ba, B:46:0x00cf, B:48:0x00d3, B:49:0x00ff, B:51:0x010d, B:59:0x011c, B:60:0x012f, B:62:0x013d, B:70:0x014c, B:71:0x0159, B:73:0x0165, B:79:0x0171, B:80:0x017e, B:84:0x0198, B:85:0x019c), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c A[Catch: Exception -> 0x01a1, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0022, B:15:0x0036, B:17:0x0048, B:24:0x005c, B:26:0x006e, B:33:0x0082, B:35:0x0094, B:41:0x00a7, B:44:0x00ba, B:46:0x00cf, B:48:0x00d3, B:49:0x00ff, B:51:0x010d, B:59:0x011c, B:60:0x012f, B:62:0x013d, B:70:0x014c, B:71:0x0159, B:73:0x0165, B:79:0x0171, B:80:0x017e, B:84:0x0198, B:85:0x019c), top: B:90:0x0004 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z10;
        boolean z11;
        String[] strArr;
        a aVar2 = aVar;
        ChipGroup chipGroup = aVar2.f39618z;
        try {
            LibraryCollection libraryCollection = (LibraryCollection) u.j2(i6, this.A);
            if (libraryCollection != null) {
                RobertoTextView robertoTextView = aVar2.f39614v;
                boolean z12 = false;
                String str8 = (String) u.j2(0, libraryCollection.getStrings());
                String str9 = "";
                String str10 = null;
                if (str8 != null) {
                    if (Boolean.valueOf(kotlin.jvm.internal.i.b(str8, "-")).booleanValue()) {
                        str8 = null;
                    }
                    if (str8 != null) {
                        robertoTextView.setText(str8);
                        RobertoTextView robertoTextView2 = aVar2.f39615w;
                        str = (String) u.j2(1, libraryCollection.getStrings());
                        if (str != null) {
                            if (Boolean.valueOf(kotlin.jvm.internal.i.b(str, "-")).booleanValue()) {
                                str = null;
                            }
                            if (str != null) {
                                robertoTextView2.setText(str);
                                RobertoTextView robertoTextView3 = aVar2.f39616x;
                                str2 = (String) u.j2(2, libraryCollection.getStrings());
                                if (str2 != null) {
                                    if (Boolean.valueOf(kotlin.jvm.internal.i.b(str2, "-")).booleanValue()) {
                                        str2 = null;
                                    }
                                    if (str2 != null) {
                                        robertoTextView3.setText(str2);
                                        RobertoTextView robertoTextView4 = aVar2.f39617y;
                                        str3 = (String) u.j2(3, libraryCollection.getStrings());
                                        if (str3 != null) {
                                            if (Boolean.valueOf(kotlin.jvm.internal.i.b(str3, "-")).booleanValue()) {
                                                str3 = null;
                                            }
                                            if (str3 != null) {
                                                str9 = str3;
                                            }
                                        }
                                        robertoTextView4.setText(str9);
                                        str4 = (String) u.j2(8, libraryCollection.getStrings());
                                        if (str4 != null && (strArr = (String[]) r.a1(str4, new String[]{","}, 0, 6).toArray(new String[0])) != null) {
                                            for (String str11 : strArr) {
                                                int i10 = bn.a.f4534a;
                                                chipGroup.addView(bn.a.a(r.i1(str11).toString(), chipGroup, libraryCollection.getAssets().get("text_color"), libraryCollection.getAssets().get("text_color_bg")));
                                            }
                                        }
                                        str5 = libraryCollection.getAssets().get("bg_asset");
                                        if (str5 != null) {
                                            if (str5.length() == 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                str5 = null;
                                            }
                                            if (str5 != null) {
                                                Glide.g(aVar2.f2751a.getContext()).p(str5).B(aVar2.A);
                                            }
                                        }
                                        str6 = libraryCollection.getAssets().get("bg_color");
                                        if (str6 != null) {
                                            if (str6.length() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                str6 = null;
                                            }
                                            if (str6 != null) {
                                                aVar2.D.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str6)));
                                            }
                                        }
                                        str7 = libraryCollection.getAssets().get("text_color");
                                        if (str7 != null) {
                                            if (str7.length() == 0) {
                                                z12 = true;
                                            }
                                            if (!z12) {
                                                str10 = str7;
                                            }
                                            if (str10 != null) {
                                                aVar2.B.setImageTintList(ColorStateList.valueOf(Color.parseColor(str10)));
                                            }
                                        }
                                        aVar2.C.setOnClickListener(new zm.a(this, libraryCollection, i6, aVar2));
                                        aVar2.E.setOnClickListener(new zm.a(aVar2, this, i6, libraryCollection));
                                        MotionLayout motionLayout = aVar2.f39613u;
                                        if (i6 != 0) {
                                            motionLayout.setProgress(1.0f);
                                            return;
                                        } else {
                                            motionLayout.setProgress(0.0f);
                                            return;
                                        }
                                    }
                                }
                                str2 = "";
                                robertoTextView3.setText(str2);
                                RobertoTextView robertoTextView42 = aVar2.f39617y;
                                str3 = (String) u.j2(3, libraryCollection.getStrings());
                                if (str3 != null) {
                                }
                                robertoTextView42.setText(str9);
                                str4 = (String) u.j2(8, libraryCollection.getStrings());
                                if (str4 != null) {
                                    while (r6 < r5) {
                                    }
                                }
                                str5 = libraryCollection.getAssets().get("bg_asset");
                                if (str5 != null) {
                                }
                                str6 = libraryCollection.getAssets().get("bg_color");
                                if (str6 != null) {
                                }
                                str7 = libraryCollection.getAssets().get("text_color");
                                if (str7 != null) {
                                }
                                aVar2.C.setOnClickListener(new zm.a(this, libraryCollection, i6, aVar2));
                                aVar2.E.setOnClickListener(new zm.a(aVar2, this, i6, libraryCollection));
                                MotionLayout motionLayout2 = aVar2.f39613u;
                                if (i6 != 0) {
                                }
                            }
                        }
                        str = "";
                        robertoTextView2.setText(str);
                        RobertoTextView robertoTextView32 = aVar2.f39616x;
                        str2 = (String) u.j2(2, libraryCollection.getStrings());
                        if (str2 != null) {
                        }
                        str2 = "";
                        robertoTextView32.setText(str2);
                        RobertoTextView robertoTextView422 = aVar2.f39617y;
                        str3 = (String) u.j2(3, libraryCollection.getStrings());
                        if (str3 != null) {
                        }
                        robertoTextView422.setText(str9);
                        str4 = (String) u.j2(8, libraryCollection.getStrings());
                        if (str4 != null) {
                        }
                        str5 = libraryCollection.getAssets().get("bg_asset");
                        if (str5 != null) {
                        }
                        str6 = libraryCollection.getAssets().get("bg_color");
                        if (str6 != null) {
                        }
                        str7 = libraryCollection.getAssets().get("text_color");
                        if (str7 != null) {
                        }
                        aVar2.C.setOnClickListener(new zm.a(this, libraryCollection, i6, aVar2));
                        aVar2.E.setOnClickListener(new zm.a(aVar2, this, i6, libraryCollection));
                        MotionLayout motionLayout22 = aVar2.f39613u;
                        if (i6 != 0) {
                        }
                    }
                }
                str8 = "";
                robertoTextView.setText(str8);
                RobertoTextView robertoTextView22 = aVar2.f39615w;
                str = (String) u.j2(1, libraryCollection.getStrings());
                if (str != null) {
                }
                str = "";
                robertoTextView22.setText(str);
                RobertoTextView robertoTextView322 = aVar2.f39616x;
                str2 = (String) u.j2(2, libraryCollection.getStrings());
                if (str2 != null) {
                }
                str2 = "";
                robertoTextView322.setText(str2);
                RobertoTextView robertoTextView4222 = aVar2.f39617y;
                str3 = (String) u.j2(3, libraryCollection.getStrings());
                if (str3 != null) {
                }
                robertoTextView4222.setText(str9);
                str4 = (String) u.j2(8, libraryCollection.getStrings());
                if (str4 != null) {
                }
                str5 = libraryCollection.getAssets().get("bg_asset");
                if (str5 != null) {
                }
                str6 = libraryCollection.getAssets().get("bg_color");
                if (str6 != null) {
                }
                str7 = libraryCollection.getAssets().get("text_color");
                if (str7 != null) {
                }
                aVar2.C.setOnClickListener(new zm.a(this, libraryCollection, i6, aVar2));
                aVar2.E.setOnClickListener(new zm.a(aVar2, this, i6, libraryCollection));
                MotionLayout motionLayout222 = aVar2.f39613u;
                if (i6 != 0) {
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39612z, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        a aVar = new a(defpackage.e.h(parent, R.layout.row_all_collections, parent, false, "from(parent.context).inf…llections, parent, false)"));
        aVar.s(false);
        return aVar;
    }
}
