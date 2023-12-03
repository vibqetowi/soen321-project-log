package cdflynn.android.library.turn;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class TurnLayoutManager extends LinearLayoutManager {
    private static final int MIN_PEEK = 0;
    private static final int MIN_RADIUS = 0;
    private Point center;
    private int gravity;
    private int peekDistance;
    private int radius;
    private boolean rotate;

    public TurnLayoutManager(Context context, int i6, int i10, int i11, int i12, boolean z10) {
        super(context, i10, false);
        this.gravity = i6;
        this.radius = Math.max(i11, 0);
        this.peekDistance = Math.min(Math.max(i12, 0), i11);
        this.rotate = z10;
        this.center = new Point();
    }

    private Point deriveCenter(int i6, int i10, int i11, int i12, Point point) {
        int i13;
        int height;
        int width;
        int i14 = 1;
        if (i6 == 8388611) {
            i13 = -1;
        } else {
            i13 = 1;
        }
        if (i6 == 8388611) {
            i14 = 0;
        }
        if (i10 != 0) {
            height = getHeight() / 2;
            width = (Math.abs(i11 - i12) * i13) + (getWidth() * i14);
        } else {
            height = (getHeight() * i14) + (Math.abs(i11 - i12) * i13);
            width = getWidth() / 2;
        }
        point.set(width, height);
        return point;
    }

    private int getMarginStart(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    private double resolveOffsetX(double d10, double d11, Point point, int i6) {
        double abs = Math.abs(point.y - d11);
        return (Math.sqrt((d10 * d10) - (abs * abs)) - d10) + i6;
    }

    private double resolveOffsetY(double d10, double d11, Point point, int i6) {
        double abs = Math.abs(point.x - d11);
        return (Math.sqrt((d10 * d10) - (abs * abs)) - d10) + i6;
    }

    private void setChildOffsets(int i6, int i10, int i11, Point point, int i12) {
        if (i10 == 1) {
            setChildOffsetsVertical(i6, i11, point, i12);
        } else if (i10 == 0) {
            setChildOffsetsHorizontal(i6, i11, point, i12);
        }
    }

    private void setChildOffsetsHorizontal(int i6, int i10, Point point, int i11) {
        int height;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null) {
                RecyclerView.n nVar = (RecyclerView.n) childAt.getLayoutParams();
                int resolveOffsetY = (int) resolveOffsetY(i10, (childAt.getWidth() / 2.0f) + childAt.getX(), point, i11);
                if (i6 == 8388611) {
                    height = resolveOffsetY + getMarginStart(nVar);
                } else {
                    height = ((getHeight() - resolveOffsetY) - childAt.getHeight()) - getMarginStart(nVar);
                }
                childAt.layout(childAt.getLeft(), height, childAt.getRight(), childAt.getHeight() + height);
                setChildRotationHorizontal(i6, childAt, i10, point);
            }
        }
    }

    private void setChildOffsetsVertical(int i6, int i10, Point point, int i11) {
        int width;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null) {
                RecyclerView.n nVar = (RecyclerView.n) childAt.getLayoutParams();
                int resolveOffsetX = (int) resolveOffsetX(i10, (childAt.getHeight() / 2.0f) + childAt.getY(), point, i11);
                if (i6 == 8388611) {
                    width = resolveOffsetX + getMarginStart(nVar);
                } else {
                    width = ((getWidth() - resolveOffsetX) - childAt.getWidth()) - getMarginStart(nVar);
                }
                childAt.layout(width, childAt.getTop(), childAt.getWidth() + width, childAt.getBottom());
                setChildRotationVertical(i6, childAt, i10, point);
            }
        }
    }

    private void setChildRotationHorizontal(int i6, View view, int i10, Point point) {
        boolean z10;
        if (!this.rotate) {
            view.setRotation(0.0f);
            return;
        }
        if ((view.getWidth() / 2.0d) + view.getX() > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f = -1.0f;
        if (i6 != 8388613 ? !z10 : z10) {
            f = 1.0f;
        }
        view.setRotation((float) (Math.toDegrees(Math.asin(Math.abs(((view.getWidth() / 2.0f) + view.getX()) - point.x) / i10)) * f));
    }

    private void setChildRotationVertical(int i6, View view, int i10, Point point) {
        boolean z10;
        if (!this.rotate) {
            view.setRotation(0.0f);
            return;
        }
        if ((view.getHeight() / 2.0d) + view.getY() > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f = 1.0f;
        if (i6 != 8388613 ? !z10 : z10) {
            f = -1.0f;
        }
        view.setRotation((float) (Math.toDegrees(Math.asin(Math.abs(((view.getHeight() / 2.0f) + view.getY()) - point.y) / i10)) * f));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void onLayoutChildren(RecyclerView.t tVar, RecyclerView.y yVar) {
        super.onLayoutChildren(tVar, yVar);
        this.center = deriveCenter(this.gravity, getOrientation(), this.radius, this.peekDistance, this.center);
        setChildOffsets(this.gravity, getOrientation(), this.radius, this.center, this.peekDistance);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int scrollHorizontallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i6, tVar, yVar);
        setChildOffsetsHorizontal(this.gravity, this.radius, this.center, this.peekDistance);
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int scrollVerticallyBy(int i6, RecyclerView.t tVar, RecyclerView.y yVar) {
        int scrollVerticallyBy = super.scrollVerticallyBy(i6, tVar, yVar);
        setChildOffsetsVertical(this.gravity, this.radius, this.center, this.peekDistance);
        return scrollVerticallyBy;
    }

    public void setGravity(int i6) {
        this.gravity = i6;
        requestLayout();
    }

    public void setPeekDistance(int i6) {
        this.peekDistance = Math.min(Math.max(i6, 0), this.radius);
        requestLayout();
    }

    public void setRadius(int i6) {
        this.radius = Math.max(i6, 0);
        requestLayout();
    }

    public void setRotate(boolean z10) {
        this.rotate = z10;
        requestLayout();
    }

    public TurnLayoutManager(Context context, int i6, int i10) {
        this(context, 8388611, 1, i6, i10, false);
    }
}
