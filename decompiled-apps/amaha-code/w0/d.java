package w0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import w0.i;
/* compiled from: InputConnectionCompat.java */
/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f36276a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, f0.b bVar) {
        super(inputConnection, false);
        this.f36276a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i6, Bundle bundle) {
        i iVar;
        if (inputContentInfo == null || Build.VERSION.SDK_INT < 25) {
            iVar = null;
        } else {
            iVar = new i(new i.a(inputContentInfo));
        }
        if (((f0.b) this.f36276a).j(iVar, i6, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i6, bundle);
    }
}
