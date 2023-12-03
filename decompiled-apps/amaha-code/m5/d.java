package m5;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
/* compiled from: SensitiveUserDataUtils.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f24849a = new d();

    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        d dVar = f24849a;
        if (b6.a.b(d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            dVar.getClass();
            if (b6.a.b(dVar)) {
                z10 = false;
            } else if (textView.getInputType() == 128) {
                z10 = true;
            } else {
                z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
            }
            if (!z10 && !dVar.a((TextView) view)) {
                TextView textView2 = (TextView) view;
                dVar.getClass();
                if (!b6.a.b(dVar) && textView2.getInputType() == 96) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    TextView textView3 = (TextView) view;
                    dVar.getClass();
                    if (!b6.a.b(dVar) && textView3.getInputType() == 112) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        TextView textView4 = (TextView) view;
                        dVar.getClass();
                        if (!b6.a.b(dVar) && textView4.getInputType() == 3) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            TextView textView5 = (TextView) view;
                            dVar.getClass();
                            if (!b6.a.b(dVar)) {
                                if (textView5.getInputType() == 32) {
                                    z14 = true;
                                } else {
                                    String i6 = f.i(textView5);
                                    if (i6 != null) {
                                        if (i6.length() == 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (!z15) {
                                            z14 = Patterns.EMAIL_ADDRESS.matcher(i6).matches();
                                        }
                                    }
                                }
                                if (z14) {
                                    return false;
                                }
                            }
                            z14 = false;
                            if (z14) {
                            }
                        }
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
            return false;
        }
    }

    public final boolean a(TextView textView) {
        int i6;
        if (b6.a.b(this)) {
            return false;
        }
        try {
            String input = f.i(textView);
            Pattern compile = Pattern.compile("\\s");
            i.f(compile, "compile(pattern)");
            i.g(input, "input");
            String replaceAll = compile.matcher(input).replaceAll("");
            i.f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            int length = replaceAll.length();
            if (length >= 12 && length <= 19) {
                int i10 = length - 1;
                if (i10 >= 0) {
                    boolean z10 = false;
                    i6 = 0;
                    while (true) {
                        int i11 = i10 - 1;
                        char charAt = replaceAll.charAt(i10);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        int digit = Character.digit((int) charAt, 10);
                        if (digit >= 0) {
                            if (z10 && (digit = digit * 2) > 9) {
                                digit = (digit % 10) + 1;
                            }
                            i6 += digit;
                            z10 = !z10;
                            if (i11 < 0) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                        }
                    }
                } else {
                    i6 = 0;
                }
                if (i6 % 10 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }
}
