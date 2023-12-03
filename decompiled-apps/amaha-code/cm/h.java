package cm;

import android.content.DialogInterface;
import android.widget.EditText;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.Utils;
import ek.k1;
import hr.u6;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f5348u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f5349v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f5350w;

    public /* synthetic */ h(Object obj, int i6, Object obj2) {
        this.f5348u = i6;
        this.f5350w = obj;
        this.f5349v = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        boolean z10;
        int i10 = this.f5348u;
        Object obj = this.f5349v;
        Object obj2 = this.f5350w;
        switch (i10) {
            case 0:
                l this$0 = (l) obj2;
                FirestoreGoal goal = (FirestoreGoal) obj;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(goal, "$goal");
                fm.a aVar = this$0.f5357w;
                if (aVar != null) {
                    aVar.v(goal);
                    return;
                }
                return;
            case 1:
                p this$02 = (p) obj2;
                FirestoreGoal goal2 = (FirestoreGoal) obj;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(goal2, "$goal");
                fm.a aVar2 = this$02.f5373y;
                if (aVar2 != null) {
                    aVar2.v(goal2);
                    return;
                }
                return;
            default:
                EditText input = (EditText) obj2;
                u6 this$03 = (u6) obj;
                int i11 = u6.f19243z;
                kotlin.jvm.internal.i.g(input, "$input");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                String item = input.getText().toString();
                if (item != null && item.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    k1 k1Var = this$03.f19247x;
                    if (k1Var != null) {
                        kotlin.jvm.internal.i.g(item, "item");
                        ArrayList<String> arrayList = k1Var.f14195z;
                        arrayList.add(item);
                        k1Var.j(ca.a.l0(arrayList));
                        return;
                    }
                    kotlin.jvm.internal.i.q("adapter");
                    throw null;
                }
                Utils.INSTANCE.showCustomToast(this$03.getActivity(), "Enter Text");
                return;
        }
    }
}
