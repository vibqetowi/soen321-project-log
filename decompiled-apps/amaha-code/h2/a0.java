package h2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import h2.k;
import java.util.HashMap;
/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class a0 extends k {
    public static final String[] S = {"android:visibility:visibility", "android:visibility:parent"};
    public int R = 3;

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17014a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17015b;

        /* renamed from: c  reason: collision with root package name */
        public int f17016c;

        /* renamed from: d  reason: collision with root package name */
        public int f17017d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f17018e;
        public ViewGroup f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b M(r rVar, r rVar2) {
        b bVar = new b();
        bVar.f17014a = false;
        bVar.f17015b = false;
        if (rVar != null) {
            HashMap hashMap = rVar.f17068a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                bVar.f17016c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                bVar.f17018e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (rVar2 != null) {
                    HashMap hashMap2 = rVar2.f17068a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        bVar.f17017d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        bVar.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (rVar == null && rVar2 != null) {
                            int i6 = bVar.f17016c;
                            int i10 = bVar.f17017d;
                            if (i6 == i10 && bVar.f17018e == bVar.f) {
                                return bVar;
                            }
                            if (i6 != i10) {
                                if (i6 == 0) {
                                    bVar.f17015b = false;
                                    bVar.f17014a = true;
                                } else if (i10 == 0) {
                                    bVar.f17015b = true;
                                    bVar.f17014a = true;
                                }
                            } else if (bVar.f == null) {
                                bVar.f17015b = false;
                                bVar.f17014a = true;
                            } else if (bVar.f17018e == null) {
                                bVar.f17015b = true;
                                bVar.f17014a = true;
                            }
                        } else if (rVar != null && bVar.f17017d == 0) {
                            bVar.f17015b = true;
                            bVar.f17014a = true;
                        } else if (rVar2 == null && bVar.f17016c == 0) {
                            bVar.f17015b = false;
                            bVar.f17014a = true;
                        }
                        return bVar;
                    }
                }
                bVar.f17017d = -1;
                bVar.f = null;
                if (rVar == null) {
                }
                if (rVar != null) {
                }
                if (rVar2 == null) {
                    bVar.f17015b = false;
                    bVar.f17014a = true;
                }
                return bVar;
            }
        }
        bVar.f17016c = -1;
        bVar.f17018e = null;
        if (rVar2 != null) {
        }
        bVar.f17017d = -1;
        bVar.f = null;
        if (rVar == null) {
        }
        if (rVar != null) {
        }
        if (rVar2 == null) {
        }
        return bVar;
    }

    public final void L(r rVar) {
        View view = rVar.f17069b;
        int visibility = view.getVisibility();
        HashMap hashMap = rVar.f17068a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    @Override // h2.k
    public final void d(r rVar) {
        L(rVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (M(p(r3, false), t(r3, false)).f17014a != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ed  */
    @Override // h2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator l(ViewGroup viewGroup, r rVar, r rVar2) {
        View view;
        boolean z10;
        View view2;
        int i6;
        Object obj;
        r rVar3;
        View view3;
        boolean z11;
        boolean z12;
        int i10;
        ViewGroup viewGroup2;
        Bitmap bitmap;
        float f;
        float f2;
        float f10;
        float f11;
        float f12;
        Float f13;
        b M = M(rVar, rVar2);
        if (M.f17014a && (M.f17018e != null || M.f != null)) {
            boolean z13 = true;
            float f14 = 0.0f;
            if (M.f17015b) {
                if ((this.R & 1) == 1 && rVar2 != null) {
                    View view4 = rVar2.f17069b;
                    if (rVar == null) {
                        View view5 = (View) view4.getParent();
                    }
                    d dVar = (d) this;
                    if (rVar != null && (f13 = (Float) rVar.f17068a.get("android:fade:transitionAlpha")) != null) {
                        f12 = f13.floatValue();
                    } else {
                        f12 = 0.0f;
                    }
                    if (f12 != 1.0f) {
                        f14 = f12;
                    }
                    return dVar.N(view4, f14, 1.0f);
                }
                return null;
            }
            int i11 = M.f17017d;
            if ((this.R & 2) == 2 && rVar != null) {
                if (rVar2 != null) {
                    view = rVar2.f17069b;
                } else {
                    view = null;
                }
                View view6 = rVar.f17069b;
                View view7 = (View) view6.getTag(R.id.save_overlay_view);
                if (view7 != null) {
                    rVar3 = rVar;
                    i6 = i11;
                    obj = "android:fade:transitionAlpha";
                    view3 = null;
                } else {
                    if (view != null && view.getParent() != null) {
                        if (i11 == 4 || view6 == view) {
                            view7 = null;
                            z10 = false;
                        }
                        view = null;
                        view7 = null;
                        z10 = true;
                    } else {
                        if (view != null) {
                            view7 = view;
                            view = null;
                            z10 = false;
                        }
                        view = null;
                        view7 = null;
                        z10 = true;
                    }
                    if (z10) {
                        if (view6.getParent() == null) {
                            view2 = view;
                            i6 = i11;
                            view7 = view6;
                            obj = "android:fade:transitionAlpha";
                            rVar3 = rVar;
                            view3 = view2;
                            z13 = false;
                        } else if (view6.getParent() instanceof View) {
                            View view8 = (View) view6.getParent();
                            if (!M(t(view8, true), p(view8, true)).f17014a) {
                                boolean z14 = q.f17065a;
                                Matrix matrix = new Matrix();
                                matrix.setTranslate(-view8.getScrollX(), -view8.getScrollY());
                                v vVar = t.f17072a;
                                vVar.G(view6, matrix);
                                vVar.H(viewGroup, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, view6.getWidth(), view6.getHeight());
                                matrix.mapRect(rectF);
                                int round = Math.round(rectF.left);
                                int round2 = Math.round(rectF.top);
                                int round3 = Math.round(rectF.right);
                                int round4 = Math.round(rectF.bottom);
                                ImageView imageView = new ImageView(view6.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (q.f17065a) {
                                    z11 = !view6.isAttachedToWindow();
                                    z12 = viewGroup.isAttachedToWindow();
                                } else {
                                    z11 = false;
                                    z12 = false;
                                }
                                boolean z15 = q.f17066b;
                                if (z15 && z11) {
                                    if (!z12) {
                                        view2 = view;
                                        i6 = i11;
                                        obj = "android:fade:transitionAlpha";
                                        bitmap = null;
                                        if (bitmap != null) {
                                            imageView.setImageBitmap(bitmap);
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        view7 = imageView;
                                    } else {
                                        viewGroup2 = (ViewGroup) view6.getParent();
                                        int indexOfChild = viewGroup2.indexOfChild(view6);
                                        view2 = view;
                                        viewGroup.getOverlay().add(view6);
                                        i10 = indexOfChild;
                                    }
                                } else {
                                    view2 = view;
                                    i10 = 0;
                                    viewGroup2 = null;
                                }
                                i6 = i11;
                                int round5 = Math.round(rectF.width());
                                obj = "android:fade:transitionAlpha";
                                int round6 = Math.round(rectF.height());
                                if (round5 > 0 && round6 > 0) {
                                    float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                    int round7 = Math.round(round5 * min);
                                    int round8 = Math.round(round6 * min);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(min, min);
                                    if (q.f17067c) {
                                        Picture picture = new Picture();
                                        Canvas beginRecording = picture.beginRecording(round7, round8);
                                        beginRecording.concat(matrix);
                                        view6.draw(beginRecording);
                                        picture.endRecording();
                                        bitmap = Bitmap.createBitmap(picture);
                                    } else {
                                        bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmap);
                                        canvas.concat(matrix);
                                        view6.draw(canvas);
                                    }
                                } else {
                                    bitmap = null;
                                }
                                if (z15 && z11) {
                                    viewGroup.getOverlay().remove(view6);
                                    viewGroup2.addView(view6, i10);
                                }
                                if (bitmap != null) {
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                imageView.layout(round, round2, round3, round4);
                                view7 = imageView;
                            } else {
                                view2 = view;
                                i6 = i11;
                                obj = "android:fade:transitionAlpha";
                                int id2 = view8.getId();
                                if (view8.getParent() == null && id2 != -1) {
                                    viewGroup.findViewById(id2);
                                }
                            }
                            rVar3 = rVar;
                            view3 = view2;
                            z13 = false;
                        }
                    }
                    view2 = view;
                    i6 = i11;
                    obj = "android:fade:transitionAlpha";
                    rVar3 = rVar;
                    view3 = view2;
                    z13 = false;
                }
                HashMap hashMap = rVar3.f17068a;
                if (view7 != null) {
                    if (!z13) {
                        int[] iArr = (int[]) hashMap.get("android:visibility:screenLocation");
                        int i12 = iArr[0];
                        int i13 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view7.offsetLeftAndRight((i12 - iArr2[0]) - view7.getLeft());
                        view7.offsetTopAndBottom((i13 - iArr2[1]) - view7.getTop());
                        ((ViewGroupOverlay) new g.x(viewGroup).f16143v).add(view7);
                    }
                    d dVar2 = (d) this;
                    t.f17072a.getClass();
                    Float f15 = (Float) hashMap.get(obj);
                    if (f15 != null) {
                        f11 = f15.floatValue();
                        f10 = 0.0f;
                    } else {
                        f10 = 0.0f;
                        f11 = 1.0f;
                    }
                    ObjectAnimator N = dVar2.N(view7, f11, f10);
                    if (!z13) {
                        if (N == null) {
                            ((ViewGroupOverlay) new g.x(viewGroup).f16143v).remove(view7);
                            return N;
                        }
                        view6.setTag(R.id.save_overlay_view, view7);
                        a(new z(this, viewGroup, view7, view6));
                        return N;
                    }
                    return N;
                }
                Object obj2 = obj;
                if (view3 != null) {
                    int visibility = view3.getVisibility();
                    v vVar2 = t.f17072a;
                    vVar2.z(0, view3);
                    d dVar3 = (d) this;
                    vVar2.getClass();
                    Float f16 = (Float) hashMap.get(obj2);
                    if (f16 != null) {
                        f2 = f16.floatValue();
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        f2 = 1.0f;
                    }
                    ObjectAnimator N2 = dVar3.N(view3, f2, f);
                    if (N2 != null) {
                        a aVar = new a(view3, i6);
                        N2.addListener(aVar);
                        N2.addPauseListener(aVar);
                        a(aVar);
                        return N2;
                    }
                    vVar2.z(visibility, view3);
                    return N2;
                }
            }
            return null;
        }
        return null;
    }

    @Override // h2.k
    public final String[] r() {
        return S;
    }

    @Override // h2.k
    public final boolean u(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.f17068a.containsKey("android:visibility:visibility") != rVar.f17068a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b M = M(rVar, rVar2);
        if (!M.f17014a) {
            return false;
        }
        if (M.f17016c != 0 && M.f17017d != 0) {
            return false;
        }
        return true;
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements k.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f17009a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17010b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f17011c;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17013e;
        public boolean f = false;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f17012d = true;

        public a(View view, int i6) {
            this.f17009a = view;
            this.f17010b = i6;
            this.f17011c = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // h2.k.d
        public final void b() {
            f(false);
        }

        @Override // h2.k.d
        public final void c(k kVar) {
            if (!this.f) {
                t.f17072a.z(this.f17010b, this.f17009a);
                ViewGroup viewGroup = this.f17011c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            kVar.y(this);
        }

        @Override // h2.k.d
        public final void e() {
            f(true);
        }

        public final void f(boolean z10) {
            ViewGroup viewGroup;
            if (this.f17012d && this.f17013e != z10 && (viewGroup = this.f17011c) != null) {
                this.f17013e = z10;
                s.a(viewGroup, z10);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f) {
                t.f17072a.z(this.f17010b, this.f17009a);
                ViewGroup viewGroup = this.f17011c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (!this.f) {
                t.f17072a.z(this.f17010b, this.f17009a);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (!this.f) {
                t.f17072a.z(0, this.f17009a);
            }
        }

        @Override // h2.k.d
        public final void d() {
        }

        @Override // h2.k.d
        public final void a(k kVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
