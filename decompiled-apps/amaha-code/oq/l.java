package oq;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.ArrayList;
import java.util.Iterator;
import pq.x;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27742a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Dialog f27743b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ rr.b f27744c;

    public /* synthetic */ l(Dialog dialog, rr.b bVar, int i6) {
        this.f27742a = i6;
        this.f27743b = dialog;
        this.f27744c = bVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        int i10 = this.f27742a;
        Dialog dialog = this.f27743b;
        rr.b bVar = this.f27744c;
        switch (i10) {
            case 0:
                m this$0 = (m) bVar;
                int i11 = m.B;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (i6 != 6) {
                    return false;
                }
                Editable text = ((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText();
                if (text != null && !gv.n.B0(text)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    if (this$0.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), this$0.f27750z) != -1) {
                        Context context = this$0.getContext();
                        kotlin.jvm.internal.i.d(context);
                        Toast.makeText(context, "This Chip is Already added", 1).show();
                    } else {
                        ArrayList<String> arrayList = this$0.f27749y;
                        if (this$0.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), arrayList) != -1) {
                            this$0.f27748x.add(arrayList.remove(this$0.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), arrayList)));
                        }
                        this$0.O(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()), true, false);
                        dialog.dismiss();
                    }
                } else {
                    Context context2 = this$0.getContext();
                    kotlin.jvm.internal.i.d(context2);
                    Toast.makeText(context2, "Type Something", 1).show();
                }
                return true;
            case 1:
                pq.b this$02 = (pq.b) bVar;
                int i12 = pq.b.C;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (i6 != 6) {
                    return false;
                }
                String obj = gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString();
                if (gv.n.B0(obj)) {
                    Context context3 = this$02.getContext();
                    kotlin.jvm.internal.i.d(context3);
                    Toast.makeText(context3, "Please type something.", 0).show();
                } else {
                    ArrayList<String> arrayList2 = this$02.f28765w;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<String> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        String lowerCase = next.toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
                        String lowerCase2 = obj.toLowerCase();
                        kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                        if (kotlin.jvm.internal.i.b(lowerCase, lowerCase2)) {
                            arrayList3.add(next);
                        }
                    }
                    if (!(!arrayList3.isEmpty())) {
                        ArrayList<String> arrayList4 = this$02.f28766x;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator<String> it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            String lowerCase3 = next2.toLowerCase();
                            kotlin.jvm.internal.i.f(lowerCase3, "this as java.lang.String).toLowerCase()");
                            String lowerCase4 = obj.toLowerCase();
                            kotlin.jvm.internal.i.f(lowerCase4, "this as java.lang.String).toLowerCase()");
                            if (kotlin.jvm.internal.i.b(lowerCase3, lowerCase4)) {
                                arrayList5.add(next2);
                            }
                        }
                        if (!(!arrayList5.isEmpty())) {
                            this$02.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), true);
                            dialog.dismiss();
                        }
                    }
                    Context context4 = this$02.getContext();
                    kotlin.jvm.internal.i.d(context4);
                    Toast.makeText(context4, "Item already added.", 0).show();
                    dialog.dismiss();
                }
                return true;
            case 2:
                pq.m this$03 = (pq.m) bVar;
                int i13 = pq.m.C;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (i6 != 6) {
                    return false;
                }
                if (!gv.n.B0(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()))) {
                    this$03.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString());
                    dialog.dismiss();
                } else {
                    Toast.makeText(this$03.getActivity(), "Plese enter a task to add it to the list", 0).show();
                }
                return true;
            case 3:
                x this$04 = (x) bVar;
                int i14 = x.A;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$04, "this$0");
                if (i6 != 6) {
                    return false;
                }
                if (!gv.n.B0(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()))) {
                    this$04.J(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString());
                    dialog.dismiss();
                } else {
                    Toast.makeText(this$04.getActivity(), "Please enter a task to add it to the list", 0).show();
                }
                return true;
            case 4:
                qq.x this$05 = (qq.x) bVar;
                int i15 = qq.x.f30085x;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                if (i6 == 6) {
                    this$05.O(dialog);
                }
                return true;
            case 5:
                rq.g this$06 = (rq.g) bVar;
                int i16 = rq.g.B;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$06, "this$0");
                if (i6 != 6) {
                    return false;
                }
                Editable text2 = ((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText();
                if (text2 != null && !gv.n.B0(text2)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    if (this$06.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), this$06.f30939y) != -1) {
                        Context context5 = this$06.getContext();
                        kotlin.jvm.internal.i.d(context5);
                        Toast.makeText(context5, "This Chip is Already added", 1).show();
                    } else {
                        ArrayList<String> arrayList6 = this$06.f30938x;
                        if (this$06.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), arrayList6) != -1) {
                            this$06.f30937w.add(arrayList6.remove(this$06.K(gv.r.i1(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText())).toString(), arrayList6)));
                        }
                        this$06.O(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()), true, false);
                        dialog.dismiss();
                    }
                } else {
                    Context context6 = this$06.getContext();
                    kotlin.jvm.internal.i.d(context6);
                    Toast.makeText(context6, "Type Something", 1).show();
                }
                return true;
            default:
                sq.r this$07 = (sq.r) bVar;
                int i17 = sq.r.B;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$07, "this$0");
                if (i6 != 6) {
                    return false;
                }
                if (!gv.n.B0(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()))) {
                    this$07.J(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()));
                    dialog.dismiss();
                } else {
                    Toast.makeText(this$07.getActivity(), "Please enter a task to add it to the list", 0).show();
                }
                return true;
        }
    }

    public /* synthetic */ l(qq.x xVar, Dialog dialog) {
        this.f27742a = 4;
        this.f27744c = xVar;
        this.f27743b = dialog;
    }
}
