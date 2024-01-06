/***************************************************
==================== JS INDEX ======================
****************************************************
01. text-notice
02. drop-btn
03. Cart Quantity Js
04. slider__active Slider Js
05. brand activation
06. Show Login Toggle Js
07. Show Coupon Toggle Js
08. Create An Account Toggle Js
09. Shipping Box Toggle Js
10. Counter Js
11. Data Background Js
12. Popup js
13. Wow Js
14. Data width Js
15. InHover Active Js
****************************************************/

(function ($) {
	("use strict");

	var windowOn = $(window);
	////////////////////////////////////////////////////
	// 01. text-notice
	$(".header-notice-action-close button").on("click", function () {
		$(".header-note-area").addClass("header-notice-hide");
	});

	// 02. drop-btn
	$(".drop-btn").on("click", function () {
		$(this).parent("").toggleClass("content-hidden");
	});

	$(".wishlist-btn").on("click", function () {
		$(this).toggleClass("w-added");
	});

	// follow btn
	$(".edu-follow-btn").click(function () {
		$(this).toggleClass("followed");
		if ($(".edu-follow-btn").hasClass("followed")) {
			$(this).html("followed");
		} else {
			$(this).html("follow");
		}
	});

	$("#show-review-box").on("click", function () {
		$("#review-box").slideToggle(700);
	});

	// 03. Cart Quantity Js
	$(".cart-minus").click(function () {
		var $input = $(this).parent().find("input");
		var count = parseInt($input.val()) - 1;
		count = count < 1 ? 1 : count;
		$input.val(count);
		$input.change();
		return false;
	});
	$(".cart-plus").click(function () {
		var $input = $(this).parent().find("input");
		$input.val(parseInt($input.val()) + 1);
		$input.change();
		return false;
	});

	// 04. slider__active Slider Js

	if (jQuery(".slider__active").length > 0) {
		let sliderActive1 = ".slider__active";
		let sliderInit1 = new Swiper(sliderActive1, {
			// Optional parameters
			slidesPerView: 1,
			slidesPerColumn: 1,
			paginationClickable: true,
			loop: true,
			effect: "fade",

			autoplay: {
				delay: 5000,
			},

			// If we need pagination
			pagination: {
				el: ".swiper-paginations",
				// dynamicBullets: true,
				clickable: true,
			},

			// Navigation arrows
			navigation: {
				nextEl: ".swiper-button-next",
				prevEl: ".swiper-button-prev",
			},

			a11y: false,
		});

		function animated_swiper(selector, init) {
			let animated = function animated() {
				$(selector + " [data-animation]").each(function () {
					let anim = $(this).data("animation");
					let delay = $(this).data("delay");
					let duration = $(this).data("duration");

					$(this)
						.removeClass("anim" + anim)
						.addClass(anim + " animated")
						.css({
							webkitAnimationDelay: delay,
							animationDelay: delay,
							webkitAnimationDuration: duration,
							animationDuration: duration,
						})
						.one(
							"webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend",
							function () {
								$(this).removeClass(anim + " animated");
							}
						);
				});
			};
			animated();
			// Make animated when slide change
			init.on("slideChange", function () {
				$(sliderActive1 + " [data-animation]").removeClass("animated");
			});
			init.on("slideChange", animated);
		}

		animated_swiper(sliderActive1, sliderInit1);
	}

	if (jQuery(".slider__active-2").length > 0) {
		let sliderActive1 = ".slider__active-2";
		let sliderInit1 = new Swiper(sliderActive1, {
			// Optional parameters
			slidesPerView: 1,
			slidesPerColumn: 1,
			paginationClickable: true,
			loop: true,
			effect: "fade",

			autoplay: {
				delay: 5000,
			},

			// If we need pagination
			pagination: {
				el: ".swiper-paginations",
				// dynamicBullets: true,
				clickable: true,
			},

			// Navigation arrows
			navigation: {
				nextEl: ".swiper-button-next",
				prevEl: ".swiper-button-prev",
			},

			a11y: false,
		});

		function animated_swiper(selector, init) {
			let animated = function animated() {
				$(selector + " [data-animation]").each(function () {
					let anim = $(this).data("animation");
					let delay = $(this).data("delay");
					let duration = $(this).data("duration");

					$(this)
						.removeClass("anim" + anim)
						.addClass(anim + " animated")
						.css({
							webkitAnimationDelay: delay,
							animationDelay: delay,
							webkitAnimationDuration: duration,
							animationDuration: duration,
						})
						.one(
							"webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend",
							function () {
								$(this).removeClass(anim + " animated");
							}
						);
				});
			};
			animated();
			// Make animated when slide change
			init.on("slideChange", function () {
				$(sliderActive1 + " [data-animation]").removeClass("animated");
			});
			init.on("slideChange", animated);
		}

		animated_swiper(sliderActive1, sliderInit1);
	}

	var themeSlider = new Swiper(".classname", {
		slidesPerView: 1,
		spaceBetween: 30,
		loop: true,
		pagination: {
			el: ".swiper-pagination",
			clickable: true,
		},
		breakpoints: {
			1200: {
				slidesPerView: 6,
			},
			992: {
				slidesPerView: 5,
			},
			768: {
				slidesPerView: 3,
			},
			576: {
				slidesPerView: 2,
			},
			0: {
				slidesPerView: 2,
			},
		},
	});

	// 05. brand activation
	const brand = new Swiper(".brand-active", {
		// Default parameters
		slidesPerView: 1,
		spaceBetween: 10,
		loop: true,
		autoplay: {
			delay: 3000,
		},
		// Responsive breakpoints
		breakpoints: {
			// when window width is >= 320px
			320: {
				slidesPerView: 1,
				spaceBetween: 20,
			},
			// when window width is >= 480px
			480: {
				slidesPerView: 2,
				spaceBetween: 30,
			},
			// when window width is >= 640px
			640: {
				slidesPerView: 3,
				spaceBetween: 40,
			},
			991: {
				slidesPerView: 4,
				spaceBetween: 40,
			},
			1200: {
				slidesPerView: 5,
				spaceBetween: 40,
			},
			1400: {
				slidesPerView: 6,
				spaceBetween: 40,
			},
		},
	});

	// brand activation
	const relproduct = new Swiper(".r-product-active", {
		// Default parameters
		slidesPerView: 1,
		spaceBetween: 10,
		loop: true,
		autoplay: {
			delay: 3000,
		},
		// Responsive breakpoints
		breakpoints: {
			// when window width is >= 320px
			320: {
				slidesPerView: 1,
				spaceBetween: 20,
			},
			// when window width is >= 480px
			480: {
				slidesPerView: 2,
				spaceBetween: 30,
			},
			// when window width is >= 640px
			640: {
				slidesPerView: 2,
				spaceBetween: 40,
			},
			991: {
				slidesPerView: 3,
				spaceBetween: 40,
			},
			1200: {
				slidesPerView: 4,
				spaceBetween: 40,
			},
			1400: {
				slidesPerView: 5,
				spaceBetween: 40,
			},
		},
	});

	////////////////////////////////////////////////////
	// 06. Show Login Toggle Js
	$("#showlogin").on("click", function () {
		$("#checkout-login").slideToggle(700);
	});
	

	////////////////////////////////////////////////////
	// 07. Show Coupon Toggle Js
	$("#showcoupon").on("click", function () {
		$("#checkout_coupon").slideToggle(700);
	});

	////////////////////////////////////////////////////
	// 08. Create An Account Toggle Js
	$("#cbox").on("click", function () {
		$("#cbox_info").slideToggle(700);
	});

	////////////////////////////////////////////////////
	// 09. Shipping Box Toggle Js
	$("#ship-box").on("click", function () {
		$("#ship-box-info").slideToggle(700);
	});

	////////////////////////////////////////////////////
	// 10. Counter Js
	$(".counter").counterUp({
		delay: 10,
		time: 1000,
	});

	////////////////////////////////////////////////////
	// 11. Data Background Js
	$("[data-background").each(function () {
		$(this).css(
			"background-image",
			"url( " + $(this).attr("data-background") + "  )"
		);
	});

	// 12. Popup js
	/* magnificPopup img view */
	$(".image-popups").magnificPopup({
		type: "image",
		gallery: {
			enabled: true,
		},
	});

	/* magnificPopup video view */
	$(".popup-video").magnificPopup({
		type: "iframe",
	});

	////////////////////////////////////////////////////
	// 13. Wow Js
	new WOW().init();

	////////////////////////////////////////////////////
	// 14. Data width Js
	$("[data-width]").each(function () {
		$(this).css("width", $(this).attr("data-width"));
	});

	////////////////////////////////////////////////////
	// 15. InHover Active Js
	$(".hover__active").on("mouseenter", function () {
		$(this)
			.addClass("active")
			.parent()
			.siblings()
			.find(".hover__active")
			.removeClass("active");
	});

	if (typeof $.fn.knob != "undefined") {
		$(".knob").each(function () {
			var $this = $(this),
				knobVal = $this.attr("data-rel");

			$this.knob({
				draw: function () {
					$(this.i).val(this.cv + "%");
				},
			});

			$this.appear(
				function () {
					$({
						value: 0,
					}).animate(
						{
							value: knobVal,
						},
						{
							duration: 2000,
							easing: "swing",
							step: function () {
								$this
									.val(Math.ceil(this.value))
									.trigger("change");
							},
						}
					);
				},
				{
					accX: 0,
					accY: -150,
				}
			);
		});
	}

})(jQuery);


