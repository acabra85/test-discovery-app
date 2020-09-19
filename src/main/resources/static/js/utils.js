$(function () {

    let result = $("#result");
    $("#but_logconsole").click(() => console.info("clicked the log console button!!"));

    $("#calc_form").submit((event) => {
        event.preventDefault();

        $.post("calculator/add", $("#calc_form").serialize(), "json")
            .done(function (data, textStatus, jqXHR) {
                console.info(textStatus);
                if (data.error) {
                    console.error("error");
                } else {
                    if (result.hasClass("label-danger")) {
                        result.removeClass("label-danger");
                    }
                    if(!result.hasClass("label-info")) {
                        result.addClass("label-info");
                    }
                    result.html(data.value);
                }
            })
            .fail(function (xhr, status, error) {
                if(result.hasClass("label-info")) {
                    result.removeClass("label-info");
                }
                if (!result.hasClass("label-danger")) {
                    result.addClass("label-danger");
                }
                result.html(xhr.responseText);
                console.error({"status": status,
                    "error": xhr.responseText
                });
            })
            .always(() => console.log("calculation completed"));
    });
});