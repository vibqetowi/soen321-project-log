package mm;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.r;
import hs.k;
import java.util.ArrayList;
import java.util.HashMap;
import ss.l;
/* compiled from: JournalListAdapter.kt */
/* loaded from: classes2.dex */
public final class f extends RecyclerView.e<a> {
    public final Context B;
    public final ArrayList<JournalModel> C;

    /* renamed from: x  reason: collision with root package name */
    public final l<JournalModel, k> f25627x;

    /* renamed from: y  reason: collision with root package name */
    public final l<JournalModel, k> f25628y;

    /* renamed from: z  reason: collision with root package name */
    public final l<JournalModel, k> f25629z;
    public final String A = LogHelper.INSTANCE.makeLogTag("JournalListAdapter");
    public final int D = 1;
    public final int E = 2;
    public final int F = 3;
    public final int G = 5;
    public final il.a H = new il.a();

    /* compiled from: JournalListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public f(p pVar, ArrayList arrayList, nm.e eVar, nm.f fVar, nm.g gVar) {
        this.f25627x = eVar;
        this.f25628y = fVar;
        this.f25629z = gVar;
        this.C = new ArrayList<>();
        this.B = pVar;
        this.C = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.C.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0.isDraft() == true) goto L5;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(int i6) {
        boolean z10;
        JournalModel journalModel = this.C.get(i6);
        if (journalModel != null) {
            z10 = true;
        }
        z10 = false;
        if (z10) {
            return this.G;
        }
        return v(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[Catch: Exception -> 0x025b, TryCatch #0 {Exception -> 0x025b, blocks: (B:3:0x0008, B:23:0x0036, B:25:0x003f, B:29:0x0052, B:31:0x005d, B:33:0x0085, B:34:0x00b4, B:36:0x00c2, B:39:0x00eb, B:45:0x0126, B:51:0x015b, B:57:0x0177, B:63:0x01af, B:69:0x01be, B:75:0x0205, B:70:0x01ca, B:71:0x01d6, B:72:0x01e2, B:73:0x01ee, B:74:0x01fa, B:58:0x0180, B:59:0x0189, B:60:0x0192, B:61:0x019b, B:62:0x01a4, B:46:0x012f, B:47:0x0138, B:48:0x0141, B:49:0x014a, B:50:0x0153, B:76:0x0208, B:78:0x022f, B:84:0x023c, B:86:0x0252, B:85:0x0247, B:18:0x002d, B:12:0x0023, B:6:0x0019), top: B:91:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036 A[Catch: Exception -> 0x025b, TryCatch #0 {Exception -> 0x025b, blocks: (B:3:0x0008, B:23:0x0036, B:25:0x003f, B:29:0x0052, B:31:0x005d, B:33:0x0085, B:34:0x00b4, B:36:0x00c2, B:39:0x00eb, B:45:0x0126, B:51:0x015b, B:57:0x0177, B:63:0x01af, B:69:0x01be, B:75:0x0205, B:70:0x01ca, B:71:0x01d6, B:72:0x01e2, B:73:0x01ee, B:74:0x01fa, B:58:0x0180, B:59:0x0189, B:60:0x0192, B:61:0x019b, B:62:0x01a4, B:46:0x012f, B:47:0x0138, B:48:0x0141, B:49:0x014a, B:50:0x0153, B:76:0x0208, B:78:0x022f, B:84:0x023c, B:86:0x0252, B:85:0x0247, B:18:0x002d, B:12:0x0023, B:6:0x0019), top: B:91:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[Catch: Exception -> 0x025b, TryCatch #0 {Exception -> 0x025b, blocks: (B:3:0x0008, B:23:0x0036, B:25:0x003f, B:29:0x0052, B:31:0x005d, B:33:0x0085, B:34:0x00b4, B:36:0x00c2, B:39:0x00eb, B:45:0x0126, B:51:0x015b, B:57:0x0177, B:63:0x01af, B:69:0x01be, B:75:0x0205, B:70:0x01ca, B:71:0x01d6, B:72:0x01e2, B:73:0x01ee, B:74:0x01fa, B:58:0x0180, B:59:0x0189, B:60:0x0192, B:61:0x019b, B:62:0x01a4, B:46:0x012f, B:47:0x0138, B:48:0x0141, B:49:0x014a, B:50:0x0153, B:76:0x0208, B:78:0x022f, B:84:0x023c, B:86:0x0252, B:85:0x0247, B:18:0x002d, B:12:0x0023, B:6:0x0019), top: B:91:0x0008 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        int i10;
        int i11;
        int b10;
        int b11;
        int b12;
        a aVar2 = aVar;
        try {
            final JournalModel journalModel = this.C.get(i6);
            int v10 = v(i6);
            boolean z13 = true;
            if (v10 != 0 && v10 != this.F) {
                z10 = false;
                if (!z10 && v10 != this.E) {
                    z11 = false;
                    if (!z11 && v10 != this.D) {
                        z12 = false;
                        if (!z12) {
                            num = Integer.valueOf((int) R.layout.layout_journal_list_item);
                        } else {
                            num = null;
                        }
                        i10 = aVar2.f;
                        i11 = this.G;
                        il.a aVar3 = this.H;
                        Context context = this.B;
                        View view = aVar2.f2751a;
                        if (i10 != i11) {
                            ((LinearLayout) view.findViewById(R.id.llJournalRowContentDraft)).removeAllViews();
                            if (num != null) {
                                int intValue = num.intValue();
                                kotlin.jvm.internal.i.e(context, "null cannot be cast to non-null type android.app.Activity");
                                View view2 = ((Activity) context).getLayoutInflater().inflate(intValue, (ViewGroup) ((LinearLayout) view.findViewById(R.id.llJournalRowContentDraft)), false);
                                kotlin.jvm.internal.i.f(view2, "view");
                                w(i6, view2);
                                ((LinearLayout) view.findViewById(R.id.llJournalRowContentDraft)).addView(view2);
                            }
                            if (journalModel != null) {
                                ((RobertoTextView) view.findViewById(R.id.tvJournalRowDateAndTimeDraft)).setText(aVar3.b(journalModel.getUserEnteredDate()));
                                view.setOnClickListener(new View.OnClickListener(this) { // from class: mm.e

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ f f25625v;

                                    {
                                        this.f25625v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        int i12 = r3;
                                        JournalModel journalModel2 = journalModel;
                                        f this$0 = this.f25625v;
                                        switch (i12) {
                                            case 0:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.f25629z.invoke(journalModel2);
                                                return;
                                            case 1:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.f25628y.invoke(journalModel2);
                                                return;
                                            default:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.f25627x.invoke(journalModel2);
                                                return;
                                        }
                                    }
                                });
                                ((AppCompatImageView) view.findViewById(R.id.ivJournalRowDeleteDraft)).setOnClickListener(new View.OnClickListener(this) { // from class: mm.e

                                    /* renamed from: v  reason: collision with root package name */
                                    public final /* synthetic */ f f25625v;

                                    {
                                        this.f25625v = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        int i12 = r3;
                                        JournalModel journalModel2 = journalModel;
                                        f this$0 = this.f25625v;
                                        switch (i12) {
                                            case 0:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.f25629z.invoke(journalModel2);
                                                return;
                                            case 1:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.f25628y.invoke(journalModel2);
                                                return;
                                            default:
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                this$0.f25627x.invoke(journalModel2);
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        ((LinearLayout) view.findViewById(R.id.llJournalRowContent)).removeAllViews();
                        if (num != null) {
                            int intValue2 = num.intValue();
                            kotlin.jvm.internal.i.e(context, "null cannot be cast to non-null type android.app.Activity");
                            View view3 = ((Activity) context).getLayoutInflater().inflate(intValue2, (ViewGroup) ((LinearLayout) view.findViewById(R.id.llJournalRowContent)), false);
                            kotlin.jvm.internal.i.f(view3, "view");
                            w(i6, view3);
                            ((LinearLayout) view.findViewById(R.id.llJournalRowContent)).addView(view3);
                        }
                        if (journalModel != null) {
                            ((RobertoTextView) view.findViewById(R.id.tvJournalRowDateAndTime)).setText(aVar3.b(journalModel.getUserEnteredDate()));
                            View findViewById = view.findViewById(R.id.viewJournalDivider);
                            int i12 = i6 % 6;
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 != 4) {
                                                b10 = g0.a.b(view.getContext(), R.color.templateLightYellow);
                                            } else {
                                                b10 = g0.a.b(view.getContext(), R.color.templateLightBlue);
                                            }
                                        } else {
                                            b10 = g0.a.b(view.getContext(), R.color.templateLightRed);
                                        }
                                    } else {
                                        b10 = g0.a.b(view.getContext(), R.color.templateLightPurple);
                                    }
                                } else {
                                    b10 = g0.a.b(view.getContext(), R.color.templateLightPeach);
                                }
                            } else {
                                b10 = g0.a.b(view.getContext(), R.color.templateLightGreen);
                            }
                            findViewById.setBackgroundColor(b10);
                            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvJournalRowDateAndTime);
                            Drawable background = robertoTextView.getBackground();
                            int i13 = i6 % 6;
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                b11 = g0.a.b(view.getContext(), R.color.templateLightYellow);
                                            } else {
                                                b11 = g0.a.b(view.getContext(), R.color.templateLightBlue);
                                            }
                                        } else {
                                            b11 = g0.a.b(view.getContext(), R.color.templateLightRed);
                                        }
                                    } else {
                                        b11 = g0.a.b(view.getContext(), R.color.templateLightPurple);
                                    }
                                } else {
                                    b11 = g0.a.b(view.getContext(), R.color.templateLightPeach);
                                }
                            } else {
                                b11 = g0.a.b(view.getContext(), R.color.templateLightGreen);
                            }
                            background.setTint(b11);
                            int i14 = i6 % 6;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            if (i14 != 4) {
                                                b12 = g0.a.b(view.getContext(), R.color.templateTextColorYellow);
                                            } else {
                                                b12 = g0.a.b(view.getContext(), R.color.templateTextColorBlue);
                                            }
                                        } else {
                                            b12 = g0.a.b(view.getContext(), R.color.templateTextColorRed);
                                        }
                                    } else {
                                        b12 = g0.a.b(view.getContext(), R.color.templateTextColorPurple);
                                    }
                                } else {
                                    b12 = g0.a.b(view.getContext(), R.color.templateTextColorPeach);
                                }
                            } else {
                                b12 = g0.a.b(view.getContext(), R.color.templateTextColorGreen);
                            }
                            robertoTextView.setTextColor(b12);
                        }
                        ((RobertoTextView) view.findViewById(R.id.tvJournalRowViewMore)).setVisibility(0);
                        ((AppCompatImageView) view.findViewById(R.id.ivJournalRowViewMore)).setVisibility(0);
                        ((LinearLayout) view.findViewById(R.id.llJournalRowContent)).setVisibility(0);
                        if (journalModel == null || !journalModel.isFavourite()) {
                            z13 = false;
                        }
                        if (z13) {
                            ((AppCompatImageView) view.findViewById(R.id.ivJournalFavourite)).setVisibility(0);
                        } else {
                            ((AppCompatImageView) view.findViewById(R.id.ivJournalFavourite)).setVisibility(8);
                        }
                        view.setOnClickListener(new View.OnClickListener(this) { // from class: mm.e

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ f f25625v;

                            {
                                this.f25625v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view32) {
                                int i122 = r3;
                                JournalModel journalModel2 = journalModel;
                                f this$0 = this.f25625v;
                                switch (i122) {
                                    case 0:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.f25629z.invoke(journalModel2);
                                        return;
                                    case 1:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.f25628y.invoke(journalModel2);
                                        return;
                                    default:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        this$0.f25627x.invoke(journalModel2);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    z12 = true;
                    if (!z12) {
                    }
                    i10 = aVar2.f;
                    i11 = this.G;
                    il.a aVar32 = this.H;
                    Context context2 = this.B;
                    View view4 = aVar2.f2751a;
                    if (i10 != i11) {
                    }
                }
                z11 = true;
                if (!z11) {
                    z12 = false;
                    if (!z12) {
                    }
                    i10 = aVar2.f;
                    i11 = this.G;
                    il.a aVar322 = this.H;
                    Context context22 = this.B;
                    View view42 = aVar2.f2751a;
                    if (i10 != i11) {
                    }
                }
                z12 = true;
                if (!z12) {
                }
                i10 = aVar2.f;
                i11 = this.G;
                il.a aVar3222 = this.H;
                Context context222 = this.B;
                View view422 = aVar2.f2751a;
                if (i10 != i11) {
                }
            }
            z10 = true;
            if (!z10) {
                z11 = false;
                if (!z11) {
                }
                z12 = true;
                if (!z12) {
                }
                i10 = aVar2.f;
                i11 = this.G;
                il.a aVar32222 = this.H;
                Context context2222 = this.B;
                View view4222 = aVar2.f2751a;
                if (i10 != i11) {
                }
            }
            z11 = true;
            if (!z11) {
            }
            z12 = true;
            if (!z12) {
            }
            i10 = aVar2.f;
            i11 = this.G;
            il.a aVar322222 = this.H;
            Context context22222 = this.B;
            View view42222 = aVar2.f2751a;
            if (i10 != i11) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        if (i6 == this.G) {
            return new a(defpackage.e.h(parent, R.layout.row_journal_list_draft_view, parent, false, "from(parent.context)\n   …raft_view, parent, false)"));
        }
        return new a(defpackage.e.h(parent, R.layout.row_journal_list_view, parent, false, "from(parent.context)\n   …list_view, parent, false)"));
    }

    public final int v(int i6) {
        String str;
        JournalModel journalModel = this.C.get(i6);
        if (journalModel != null) {
            str = journalModel.getTemplateType();
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.i.b(str, "regular")) {
            return 0;
        }
        if (kotlin.jvm.internal.i.b(str, "arc")) {
            return this.F;
        }
        if (kotlin.jvm.internal.i.b(str, Constants.GOAL_TYPE_THOUGHT)) {
            return this.E;
        }
        if (!kotlin.jvm.internal.i.b(str, "question")) {
            return 0;
        }
        return this.D;
    }

    public final void w(int i6, View view) {
        String str;
        CharSequence charSequence;
        HashMap<String, Object> data;
        Object obj;
        HashMap<String, Object> data2;
        Object obj2;
        String str2;
        Object obj3;
        HashMap<String, Object> data3;
        Object obj4;
        HashMap<String, Object> data4;
        Object obj5;
        HashMap<String, Object> data5;
        Object obj6;
        HashMap<String, Object> data6;
        View findViewById = view.findViewById(R.id.tvJournalListTitle);
        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView = (RobertoTextView) findViewById;
        ArrayList<JournalModel> arrayList = this.C;
        JournalModel journalModel = arrayList.get(i6);
        CharSequence charSequence2 = null;
        if (journalModel != null) {
            str = journalModel.getTemplateType();
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.i.b(str, "regular")) {
            JournalModel journalModel2 = arrayList.get(i6);
            if (journalModel2 != null && (data6 = journalModel2.getData()) != null) {
                obj6 = data6.get("j0_0_text_1");
            } else {
                obj6 = null;
            }
            String str3 = (String) obj6;
            if (str3 != null) {
                charSequence = r.i1(ca.a.Z(str3));
            }
            charSequence = null;
        } else if (kotlin.jvm.internal.i.b(str, "question")) {
            JournalModel journalModel3 = arrayList.get(i6);
            if (journalModel3 != null && (data2 = journalModel3.getData()) != null && (obj2 = data2.get("j1_0_text_1")) != null) {
                charSequence = obj2.toString();
            }
            charSequence = null;
        } else if (!kotlin.jvm.internal.i.b(str, Constants.GOAL_TYPE_THOUGHT)) {
            charSequence = "";
        } else {
            JournalModel journalModel4 = arrayList.get(i6);
            if (journalModel4 != null && (data = journalModel4.getData()) != null && (obj = data.get("j2_0_text_1")) != null) {
                charSequence = obj.toString();
            }
            charSequence = null;
        }
        robertoTextView.setText(charSequence);
        View findViewById2 = view.findViewById(R.id.tvJournalListDescription);
        kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView2 = (RobertoTextView) findViewById2;
        JournalModel journalModel5 = arrayList.get(i6);
        if (journalModel5 != null) {
            str2 = journalModel5.getTemplateType();
        } else {
            str2 = null;
        }
        if (kotlin.jvm.internal.i.b(str2, "regular")) {
            JournalModel journalModel6 = arrayList.get(i6);
            if (journalModel6 != null && (data5 = journalModel6.getData()) != null) {
                obj5 = data5.get("j0_0_text_2");
            } else {
                obj5 = null;
            }
            String str4 = (String) obj5;
            if (str4 != null) {
                charSequence2 = r.i1(ca.a.Z(str4));
            }
        } else if (kotlin.jvm.internal.i.b(str2, "question")) {
            JournalModel journalModel7 = arrayList.get(i6);
            if (journalModel7 != null && (data4 = journalModel7.getData()) != null) {
                obj4 = data4.get("j1_0_text_2");
            } else {
                obj4 = null;
            }
            String str5 = (String) obj4;
            if (str5 != null) {
                charSequence2 = r.i1(ca.a.Z(str5));
            }
        } else if (!kotlin.jvm.internal.i.b(str2, Constants.GOAL_TYPE_THOUGHT)) {
            charSequence2 = "";
        } else {
            JournalModel journalModel8 = arrayList.get(i6);
            if (journalModel8 != null && (data3 = journalModel8.getData()) != null) {
                obj3 = data3.get("j2_0_text_2");
            } else {
                obj3 = null;
            }
            String str6 = (String) obj3;
            if (str6 != null) {
                charSequence2 = r.i1(ca.a.Z(str6));
            }
        }
        robertoTextView2.setText(charSequence2);
    }
}
