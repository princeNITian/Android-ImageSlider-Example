package example.com.prince.usamp22;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {
    Context mContext;

    ImageAdapter(Context context){
        this.mContext = context;

    }



    @Override
    public boolean isViewFromObject(View view, Object object){
        return view == ((ImageView) object);
    }

    private int[] sliderImageId = new int[] {
            R.drawable.instagram,R.drawable.facebook,R.drawable.twitter,R.drawable.pinterest,R.drawable.linkedin
    };

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager)container).addView(imageView,0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }

}
