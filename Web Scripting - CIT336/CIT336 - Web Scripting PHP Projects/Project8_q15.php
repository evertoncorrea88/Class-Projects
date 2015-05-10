<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Retail Sale</title>
        <meta name="GENERATOR" content="WDL-Website-Builder" />
    </head>

    <body>
        <table style="HEIGHT: 9px; WIDTH: 801px" cellpadding="2" border="2">
            <tbody>
                <tr>
                    <td>
                        <p align="center"><strong>RETAIL SALE</strong><br /></p>
                    </td>
                </tr>
            </tbody>
        </table>

        <align>
            <table style="HEIGHT: 99px; WIDTH: 801px" cellpadding="2" border="2">
                <tbody>
                    <tr>
                        <td width="392">
                            <align>
                                <strong>Description</strong>
                            </align>
                        </td>

                        <td width="6">
                            <align>
                                <strong>Quantity</strong>
                            </align>
                        </td>

                        <td width="115">
                            <align>
                                <strong>Unit Price</strong>
                            </align>
                        </td>

                        <td width="34"><strong>Total</strong></td>
                    </tr>

                    <?php
                    $names = array();
                    $order = array();
                    $price = array();
//                    $available = array();
                    $tax;
                    $subTotal;
                    $total;

                    function initialize() {
                        global $names, $order, $price, $tax, $subTotal, $total;
                        $tax = 0.065;
                        $names = array("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8");
                        $price = array(10.22, 5.25, 14.50, 10.00, 11.05, 16.75, 20.25, 12.20);
//                        $availabel = array(10, 22, 11, 12, 5, 16, 17, 8);
                        $subTotal = 0;
                        $total = 0;
                    }

                    function input() {
                        //This function is complete. Do not change it.
                        global $order;
                        for ($i = 0; $i < 8; $i++)
                            $order[$i] = $_POST["item" . ($i + 1)];
                    }

                    function output() {
                        //Complete this function
                        global $names, $order, $price, $subTotal;
                        $content = "";
                        $item_total = 0;

                        for ($i = 0; $i < sizeof($names); $i++) {
                            $item_total = $order[$i] * $price[$i];
                            $subTotal = $subTotal + $item_total;
                            $content = $content .
                                    "<tr>" .
                                    "<td>" . $names[$i] . "</td>" .
                                    "<td>" . $order[$i] . "</td>" .
                                    "<td>" . $price[$i] . "</td>" .
                                    "<td>" . $item_total . "</td>" .
                                    "</tr>";
                        }
                        print $content;
                    }

                    function calculate() {
                        //Complete this function
                        global $tax, $subTotal, $total;

                        $tax = $subTotal * $tax;
                        $total = $subTotal + $tax;
                    }

                    initialize();
                    input();
                    output();
                    calculate();
                    ?>


                </tbody>
            </table><br />
            <br />
        </align><em><strong>Summary:</strong></em><br />

        <table style="HEIGHT: 93px; WIDTH: 393px" border="2">
            <tbody>
                <tr>
                    <td><strong>Sub-Total</strong></td>
                    <td>
                        <?php echo $subTotal; ?>
                    </td>
                </tr>
                <tr>
                    <td><strong>Tax (6.5%)</strong></td>
                    <td>
                        <?php echo $tax; ?>
                    </td>
                </tr>
                <tr>
                    <td><strong>Total</strong></td>
                    <td>
                        <?php echo $total; ?>
                    </td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
