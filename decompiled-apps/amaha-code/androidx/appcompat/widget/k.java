package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.b0;
import com.theinnerhour.b2b.R;
import t0.c;
/* compiled from: AppCompatEditText.java */
/* loaded from: classes.dex */
public class k extends EditText implements t0.v, androidx.core.widget.p {

    /* renamed from: u  reason: collision with root package name */
    public final e f1463u;

    /* renamed from: v  reason: collision with root package name */
    public final c0 f1464v;

    /* renamed from: w  reason: collision with root package name */
    public final b0 f1465w;

    /* renamed from: x  reason: collision with root package name */
    public final androidx.core.widget.n f1466x;

    /* renamed from: y  reason: collision with root package name */
    public final l f1467y;

    /* renamed from: z  reason: collision with root package name */
    public a f1468z;

    /* compiled from: AppCompatEditText.java */
    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private a getSuperCaller() {
        if (this.f1468z == null) {
            this.f1468z = new a();
        }
        return this.f1468z;
    }

    @Override // t0.v
    public final t0.c a(t0.c cVar) {
        return this.f1466x.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1463u;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f1464v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1463u;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1463u;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1464v.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1464v.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f1465w) != null) {
            TextClassifier textClassifier = b0Var.f1349b;
            if (textClassifier == null) {
                return b0.a.a(b0Var.f1348a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r1 != null) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i6;
        String[] h10;
        String[] stringArray;
        InputConnection eVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1464v.getClass();
        c0.h(this, onCreateInputConnection, editorInfo);
        kc.f.Q(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && (i6 = Build.VERSION.SDK_INT) <= 30 && (h10 = t0.d0.h(this)) != null) {
            if (i6 >= 25) {
                editorInfo.contentMimeTypes = h10;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", h10);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", h10);
            }
            f0.b bVar = new f0.b(1, this);
            if (i6 >= 25) {
                eVar = new w0.d(onCreateInputConnection, bVar);
            } else {
                String[] strArr = w0.c.f36275a;
                if (i6 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        eVar = new w0.e(onCreateInputConnection, bVar);
                    }
                }
            }
            onCreateInputConnection = eVar;
        }
        return this.f1467y.r(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i6 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i6 < 31 && i6 >= 24 && dragEvent.getLocalState() == null && t0.d0.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = w.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i6) {
        ClipData primaryClip;
        c.b c0544c;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        if (i10 < 31 && t0.d0.h(this) != null && (i6 == 16908322 || i6 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i10 >= 31) {
                    c0544c = new c.a(primaryClip, 1);
                } else {
                    c0544c = new c.C0544c(primaryClip, 1);
                }
                if (i6 != 16908322) {
                    i11 = 1;
                }
                c0544c.b(i11);
                t0.d0.m(this, c0544c.build());
            }
            i11 = 1;
        }
        if (i11 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1463u;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f1463u;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1464v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f1464v;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1467y.w(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1467y.m(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1463u;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1463u;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f1464v;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f1464v;
        c0Var.m(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        c0 c0Var = this.f1464v;
        if (c0Var != null) {
            c0Var.g(i6, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1465w) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.f1349b = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, R.attr.editTextStyle);
        i1.a(context);
        g1.a(getContext(), this);
        e eVar = new e(this);
        this.f1463u = eVar;
        eVar.d(attributeSet, R.attr.editTextStyle);
        c0 c0Var = new c0(this);
        this.f1464v = c0Var;
        c0Var.f(attributeSet, R.attr.editTextStyle);
        c0Var.b();
        this.f1465w = new b0(this);
        this.f1466x = new androidx.core.widget.n();
        l lVar = new l(this);
        this.f1467y = lVar;
        lVar.q(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m10 = lVar.m(keyListener);
            if (m10 == keyListener) {
                return;
            }
            super.setKeyListener(m10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
