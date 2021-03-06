package com.caojing.kotlinone.fkcamera.adapter;

import android.graphics.Color;

import com.caojing.kotlinone.R;
import com.caojing.kotlinone.fkcamera.bean.CameraTypeBean;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by Caojing on 2018/8/21.
 * 你不是一个人在战斗
 */
public class CameraTypeAdapter extends BaseQuickAdapter<CameraTypeBean, BaseViewHolder> {
    public CameraTypeAdapter() {
        super(R.layout.item_cameratype_layout);
    }

    private int position = 0;

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    protected void convert(BaseViewHolder helper, CameraTypeBean item) {
        helper.setText(R.id.tv_cameratype_name,item.getTypeName());
        if (position == helper.getLayoutPosition()){
            helper.setTextColor(R.id.tv_cameratype_name, Color.parseColor("#5CA52A"));
        }else{
            helper.setTextColor(R.id.tv_cameratype_name, Color.parseColor("#FFFFFF"));
        }
    }
}
