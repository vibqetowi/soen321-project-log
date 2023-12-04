package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private int fadeMove;
    private float motionEffectAlpha;
    private int motionEffectEnd;
    private int motionEffectStart;
    private boolean motionEffectStrictMove;
    private int motionEffectTranslationX;
    private int motionEffectTranslationY;
    private int viewTransitionId;

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        return true;
    }

    public MotionEffect(Context context) {
        super(context);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
    }

    public MotionEffect(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
        init(context, attrs);
    }

    public MotionEffect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.motionEffectAlpha = 0.1f;
        this.motionEffectStart = 49;
        this.motionEffectEnd = 50;
        this.motionEffectTranslationX = 0;
        this.motionEffectTranslationY = 0;
        this.motionEffectStrictMove = true;
        this.viewTransitionId = -1;
        this.fadeMove = -1;
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.motionEffectStart);
                    this.motionEffectStart = i2;
                    this.motionEffectStart = Math.max(Math.min(i2, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.motionEffectEnd);
                    this.motionEffectEnd = i3;
                    this.motionEffectEnd = Math.max(Math.min(i3, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationX) {
                    this.motionEffectTranslationX = obtainStyledAttributes.getDimensionPixelOffset(index, this.motionEffectTranslationX);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationY) {
                    this.motionEffectTranslationY = obtainStyledAttributes.getDimensionPixelOffset(index, this.motionEffectTranslationY);
                } else if (index == R.styleable.MotionEffect_motionEffect_alpha) {
                    this.motionEffectAlpha = obtainStyledAttributes.getFloat(index, this.motionEffectAlpha);
                } else if (index == R.styleable.MotionEffect_motionEffect_move) {
                    this.fadeMove = obtainStyledAttributes.getInt(index, this.fadeMove);
                } else if (index == R.styleable.MotionEffect_motionEffect_strict) {
                    this.motionEffectStrictMove = obtainStyledAttributes.getBoolean(index, this.motionEffectStrictMove);
                } else if (index == R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.viewTransitionId = obtainStyledAttributes.getResourceId(index, this.viewTransitionId);
                }
            }
            int i4 = this.motionEffectStart;
            int i5 = this.motionEffectEnd;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.motionEffectStart = i4 - 1;
                } else {
                    this.motionEffectEnd = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0188, code lost:
        if (r14 == 0.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019c, code lost:
        if (r14 == 0.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ac, code lost:
        if (r15 == 0.0f) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bc, code lost:
        if (r15 == 0.0f) goto L63;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPreSetup(MotionLayout motionLayout, HashMap<View, MotionController> controllerMap) {
        Key key;
        Key key2;
        Key key3;
        boolean z;
        HashMap<View, MotionController> hashMap = controllerMap;
        View[] views = getViews((ConstraintLayout) getParent());
        if (views == null) {
            Log.v(TAG, Debug.getLoc() + " views = null");
            return;
        }
        Key keyAttributes = new KeyAttributes();
        Key keyAttributes2 = new KeyAttributes();
        keyAttributes.setValue("alpha", Float.valueOf(this.motionEffectAlpha));
        keyAttributes2.setValue("alpha", Float.valueOf(this.motionEffectAlpha));
        keyAttributes.setFramePosition(this.motionEffectStart);
        keyAttributes2.setFramePosition(this.motionEffectEnd);
        KeyPosition keyPosition = new KeyPosition();
        keyPosition.setFramePosition(this.motionEffectStart);
        keyPosition.setType(0);
        keyPosition.setValue("percentX", 0);
        keyPosition.setValue("percentY", 0);
        KeyPosition keyPosition2 = new KeyPosition();
        keyPosition2.setFramePosition(this.motionEffectEnd);
        keyPosition2.setType(0);
        keyPosition2.setValue("percentX", 1);
        keyPosition2.setValue("percentY", 1);
        Key key4 = null;
        if (this.motionEffectTranslationX > 0) {
            key = new KeyAttributes();
            key2 = new KeyAttributes();
            key.setValue("translationX", Integer.valueOf(this.motionEffectTranslationX));
            key.setFramePosition(this.motionEffectEnd);
            key2.setValue("translationX", 0);
            key2.setFramePosition(this.motionEffectEnd - 1);
        } else {
            key = null;
            key2 = null;
        }
        if (this.motionEffectTranslationY > 0) {
            key4 = new KeyAttributes();
            key3 = new KeyAttributes();
            key4.setValue("translationY", Integer.valueOf(this.motionEffectTranslationY));
            key4.setFramePosition(this.motionEffectEnd);
            key3.setValue("translationY", 0);
            key3.setFramePosition(this.motionEffectEnd - 1);
        } else {
            key3 = null;
        }
        int i = this.fadeMove;
        if (i == -1) {
            int[] iArr = new int[4];
            for (View view : views) {
                MotionController motionController = hashMap.get(view);
                if (motionController != null) {
                    float finalX = motionController.getFinalX() - motionController.getStartX();
                    float finalY = motionController.getFinalY() - motionController.getStartY();
                    if (finalY < 0.0f) {
                        iArr[1] = iArr[1] + 1;
                    }
                    if (finalY > 0.0f) {
                        iArr[0] = iArr[0] + 1;
                    }
                    if (finalX > 0.0f) {
                        iArr[3] = iArr[3] + 1;
                    }
                    if (finalX < 0.0f) {
                        iArr[2] = iArr[2] + 1;
                    }
                }
            }
            int i2 = iArr[0];
            i = 0;
            for (int i3 = 1; i3 < 4; i3++) {
                int i4 = iArr[i3];
                if (i2 < i4) {
                    i = i3;
                    i2 = i4;
                }
            }
        }
        int i5 = 0;
        while (i5 < views.length) {
            MotionController motionController2 = hashMap.get(views[i5]);
            if (motionController2 != null) {
                float finalX2 = motionController2.getFinalX() - motionController2.getStartX();
                float finalY2 = motionController2.getFinalY() - motionController2.getStartY();
                if (i == 0) {
                    if (finalY2 > 0.0f) {
                        if (this.motionEffectStrictMove) {
                        }
                        z = false;
                    }
                    z = true;
                } else if (i == 1) {
                    if (finalY2 < 0.0f) {
                        if (this.motionEffectStrictMove) {
                        }
                        z = false;
                    }
                    z = true;
                } else if (i == 2) {
                    if (finalX2 < 0.0f) {
                        if (this.motionEffectStrictMove) {
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    if (i == 3) {
                        if (finalX2 > 0.0f) {
                            if (this.motionEffectStrictMove) {
                            }
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    int i6 = this.viewTransitionId;
                    if (i6 == -1) {
                        motionController2.addKey(keyAttributes);
                        motionController2.addKey(keyAttributes2);
                        motionController2.addKey(keyPosition);
                        motionController2.addKey(keyPosition2);
                        if (this.motionEffectTranslationX > 0) {
                            motionController2.addKey(key);
                            motionController2.addKey(key2);
                        }
                        if (this.motionEffectTranslationY > 0) {
                            motionController2.addKey(key4);
                            motionController2.addKey(key3);
                        }
                    } else {
                        motionLayout.applyViewTransition(i6, motionController2);
                    }
                    i5++;
                    hashMap = controllerMap;
                }
            }
            i5++;
            hashMap = controllerMap;
        }
    }
}
