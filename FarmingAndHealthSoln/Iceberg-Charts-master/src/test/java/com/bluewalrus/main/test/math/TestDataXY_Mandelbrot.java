package com.bluewalrus.main.test.math;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.bluewalrus.chart.Chart;
import com.bluewalrus.chart.XYChart;
import com.bluewalrus.chart.XYDataSeries;
import com.bluewalrus.chart.datapoint.DataPoint;
import com.bluewalrus.chart.draw.point.UIPointSquare;
import com.bluewalrus.main.test.ChartTester;

public class TestDataXY_Mandelbrot extends ChartTester {

	public static void main(String[] args) throws Exception {
		ChartTester t = new TestDataXY_Mandelbrot();
		t.testChart(t.getChart());
	}

	public Chart getChart() {
		
		ArrayList<XYDataSeries> xySeriesList = new ArrayList<XYDataSeries>();

		ArrayList<DataPoint> values = new ArrayList<DataPoint>();
		
		
		int width = 1920, height = 1080, max = 1000;
		
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		
//		int black = 0x000000, white = 0xFFFFFF;

		for (int row = 0; row < height; row++) {
			
			for (int col = 0; col < width; col++) {
				
				double c_re = (col - width / 2) * 4.0 / width;
				
				double c_im = (row - height / 2) * 4.0 / width;
				
				double x = 0, y = 0;
				
				int iterations = 0;
				
				while (x * x + y * y < 4 && iterations < max) {
					double x_new = x * x - y * y + c_re;
					y = 2 * x * y + c_im;
					x = x_new;
					iterations++;
				}
				
				if (iterations < max)
					values.add(new DataPoint(col, row));
				else {}
			}
		}

		
		XYDataSeries series = new XYDataSeries(new UIPointSquare(Color.GRAY,1), null, "");
		
		series.dataPoints = values;
		
		XYChart chart = new XYChart("", "", "", series);
		chart.setSize(1000, 500);
		chart.rightOffset = 200;

		chart.setTitleFont(new Font("Ariel", Font.PLAIN, 24));
		chart.setTitle("Maths");
		
		return chart;
	}
	
	@Override
	public String getNiceTitle() {
		return "Mandelbrot Set";
	}
}