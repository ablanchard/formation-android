package com.example.parlezvoustouch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;

public class ParlezVousView extends SurfaceView {

	Paint paint = new Paint();

	public ParlezVousView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		paint.setColor(Color.RED);
		// Dessiner ici !
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		// Gérer les actions ici !
		switch (event.getAction()) {
		case MotionEvent.ACTION_UP:
			// relâchement du doigt
			break;
		}

		return true;
	}

}