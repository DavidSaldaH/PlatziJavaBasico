package com.anvicode.amazonviewer;

import java.util.Date;

import com.anvicode.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] argsint) {
		Movie movie = new Movie("Origin", "Fiction", (short) 2017);
		movie.showData();
		//showMenu();
	}

	public static void showMenu() {
		int exit = 0;
		do {
			System.out.println("Wellcome to AmazonViewer");
			System.out.println("");
			System.out.println("Seleccione la opción");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Chapters");
			System.out.println("4. Books");
			System.out.println("5. Magazines");
			System.out.println("6. Report");
			System.out.println("7. Report Today");
			System.out.println("0. Exit");

			int response = 1;
			switch (response) {
			case 0:

				break;
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showChapters();
				break;
			case 4:
				showBooks();
				break;
			case 5:
				showMagazines();
				break;
			case 6:
				makeReport();
				break;
			case 7:
				makeRport(new Date());
				break;

			default:
				System.out.println();
				System.out.println("Seleccione una opción");
				System.out.println();
				break;
			}

		} while (exit != 0);
	}

	public static void showMovies() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::MOVIES::");
			System.out.println();
		} while (exit != 0);
	}

	public static void showSeries() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::SERIES::");
			System.out.println();
		} while (exit != 0);
	}

	public static void showChapters() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::CHAPTERS::");
			System.out.println();
		} while (exit != 0);
	}

	public static void showBooks() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::BOOKS::");
			System.out.println();
		} while (exit != 0);
	}

	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println("::MAGAZINES::");
			System.out.println();
		} while (exit != 0);
	}

	public static void makeReport() {

	}

	public static void makeRport(Date date) {

	}
}
