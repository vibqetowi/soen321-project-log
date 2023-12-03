package e1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* compiled from: EmojiTextViewHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f13713a;

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f13714a;

        /* renamed from: b  reason: collision with root package name */
        public final d f13715b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f13716c = true;

        public a(TextView textView) {
            this.f13714a = textView;
            this.f13715b = new d(textView);
        }

        @Override // e1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f13716c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i6 = 0; i6 < inputFilterArr.length; i6++) {
                    InputFilter inputFilter = inputFilterArr[i6];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i6, inputFilter);
                    }
                }
                if (sparseArray.size() != 0) {
                    int length = inputFilterArr.length;
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                    int i10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (sparseArray.indexOfKey(i11) < 0) {
                            inputFilterArr2[i10] = inputFilterArr[i11];
                            i10++;
                        }
                    }
                    return inputFilterArr2;
                }
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            int i12 = 0;
            while (true) {
                d dVar = this.f13715b;
                if (i12 < length2) {
                    if (inputFilterArr[i12] != dVar) {
                        i12++;
                    } else {
                        return inputFilterArr;
                    }
                } else {
                    InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                }
            }
        }

        @Override // e1.f.b
        public final boolean b() {
            return this.f13716c;
        }

        @Override // e1.f.b
        public final void c(boolean z10) {
            if (z10) {
                TextView textView = this.f13714a;
                textView.setTransformationMethod(e(textView.getTransformationMethod()));
            }
        }

        @Override // e1.f.b
        public final void d(boolean z10) {
            this.f13716c = z10;
            TextView textView = this.f13714a;
            textView.setTransformationMethod(e(textView.getTransformationMethod()));
            textView.setFilters(a(textView.getFilters()));
        }

        @Override // e1.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.f13716c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    return new h(transformationMethod);
                }
                return transformationMethod;
            } else if (transformationMethod instanceof h) {
                return ((h) transformationMethod).f13723u;
            } else {
                return transformationMethod;
            }
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f13717a;

        public c(TextView textView) {
            this.f13717a = new a(textView);
        }

        @Override // e1.f.b
        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            boolean z10;
            if (androidx.emoji2.text.f.f2034j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return inputFilterArr;
            }
            return this.f13717a.a(inputFilterArr);
        }

        @Override // e1.f.b
        public final boolean b() {
            return this.f13717a.f13716c;
        }

        @Override // e1.f.b
        public final void c(boolean z10) {
            boolean z11;
            if (androidx.emoji2.text.f.f2034j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return;
            }
            this.f13717a.c(z10);
        }

        @Override // e1.f.b
        public final void d(boolean z10) {
            boolean z11;
            if (androidx.emoji2.text.f.f2034j != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = !z11;
            a aVar = this.f13717a;
            if (z12) {
                aVar.f13716c = z10;
            } else {
                aVar.d(z10);
            }
        }

        @Override // e1.f.b
        public final TransformationMethod e(TransformationMethod transformationMethod) {
            boolean z10;
            if (androidx.emoji2.text.f.f2034j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return transformationMethod;
            }
            return this.f13717a.e(transformationMethod);
        }
    }

    public f(TextView textView) {
        if (textView != null) {
            this.f13713a = new c(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }
}
