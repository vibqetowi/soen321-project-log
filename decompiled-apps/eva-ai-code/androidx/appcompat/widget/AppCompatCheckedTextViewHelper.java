package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CheckedTextViewCompat;
/* loaded from: classes.dex */
class AppCompatCheckedTextViewHelper {
    private ColorStateList mCheckMarkTintList = null;
    private PorterDuff.Mode mCheckMarkTintMode = null;
    private boolean mHasCheckMarkTint = false;
    private boolean mHasCheckMarkTintMode = false;
    private boolean mSkipNextApply;
    private final CheckedTextView mView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatCheckedTextViewHelper(CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0041, B:13:0x0049, B:15:0x0051, B:16:0x005e, B:18:0x0066, B:19:0x0071, B:21:0x0079), top: B:30:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #1 {all -> 0x008e, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0041, B:13:0x0049, B:15:0x0051, B:16:0x005e, B:18:0x0066, B:19:0x0071, B:21:0x0079), top: B:30:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        boolean z;
        int resourceId;
        int resourceId2;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, R.styleable.CheckedTextView, i, 0);
        CheckedTextView checkedTextView = this.mView;
        ViewCompat.saveAttributeDataForStyleable(checkedTextView, checkedTextView.getContext(), R.styleable.CheckedTextView, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.CheckedTextView_checkMarkCompat) && (resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.mView;
                    checkedTextView2.setCheckMarkDrawable(AppCompatResources.getDrawable(checkedTextView2.getContext(), resourceId2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z && obtainStyledAttributes.hasValue(R.styleable.CheckedTextView_android_checkMark) && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.CheckedTextView_android_checkMark, 0)) != 0) {
                    CheckedTextView checkedTextView3 = this.mView;
                    checkedTextView3.setCheckMarkDrawable(AppCompatResources.getDrawable(checkedTextView3.getContext(), resourceId));
                }
                if (obtainStyledAttributes.hasValue(R.styleable.CheckedTextView_checkMarkTint)) {
                    CheckedTextViewCompat.setCheckMarkTintList(this.mView, obtainStyledAttributes.getColorStateList(R.styleable.CheckedTextView_checkMarkTint));
                }
                if (obtainStyledAttributes.hasValue(R.styleable.CheckedTextView_checkMarkTintMode)) {
                    CheckedTextViewCompat.setCheckMarkTintMode(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(R.styleable.CheckedTextView_checkMarkTintMode, -1), null));
                }
            }
            z = false;
            if (!z) {
                CheckedTextView checkedTextView32 = this.mView;
                checkedTextView32.setCheckMarkDrawable(AppCompatResources.getDrawable(checkedTextView32.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.CheckedTextView_checkMarkTint)) {
            }
            if (obtainStyledAttributes.hasValue(R.styleable.CheckedTextView_checkMarkTintMode)) {
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        applyCheckMarkTint();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void applyCheckMarkTint() {
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(this.mView);
        if (checkMarkDrawable != null) {
            if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
                Drawable mutate = DrawableCompat.wrap(checkMarkDrawable).mutate();
                if (this.mHasCheckMarkTint) {
                    DrawableCompat.setTintList(mutate, this.mCheckMarkTintList);
                }
                if (this.mHasCheckMarkTintMode) {
                    DrawableCompat.setTintMode(mutate, this.mCheckMarkTintMode);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.mView.getDrawableState());
                }
                this.mView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
