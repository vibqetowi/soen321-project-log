package er;

import android.content.DialogInterface;
import android.widget.EditText;
import er.d;
import java.util.Calendar;
import java.util.Iterator;
/* compiled from: SleepDropDownFragment.java */
/* loaded from: classes2.dex */
public final class e implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ EditText f14492u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f14493v;

    public e(d dVar, EditText editText) {
        this.f14493v = dVar;
        this.f14492u = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        String obj = this.f14492u.getText().toString();
        if (obj != null && !obj.equals("")) {
            int i10 = d.A;
            d dVar = this.f14493v;
            dVar.getClass();
            String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
            Iterator<d.C0221d> it = dVar.f14483y.iterator();
            while (it.hasNext()) {
                it.next().f14488u.put(valueOf, obj);
            }
        }
    }
}
