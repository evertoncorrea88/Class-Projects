<?php

class Transaction {

    private $price;
    private $amount;
    private $change;
    private $values = array(5000, 2000, 1000, 500, 100, 25, 10, 5, 1);
    private $counters = array(0, 0, 0, 0, 0, 0, 0, 0, 0);
    private $bills = array('Fifty(50)', 'Twenty(20)', 'Ten(10)', 'Five(5)', 'One(1)',
        'Quarter(0.25)', 'Dime(0.10)', 'Nickel(0.05)', 'Penny(0.01)');

    public function change() {
        $this->price = $_POST['price'];
        $this->amount = $_POST['amount'];

        $this->change = $this->amount - $this->price;

        echo 'Price: ' . $this->price;
        echo '<br>Amount: ' . $this->amount;
        echo '<br>Change: ' . $this->change;

        $this->change = $this->change * 100;

        for ($i = 0; $i < count($this->values); $i++) {
            $this->counters[$i] = (int) ($this->change / $this->values[$i]);
            $this->change = $this->change - ($this->values[$i] * $this->counters[$i]);
        }

        echo '<hr>Change in bills:';

        for ($i = 0; $i < count($this->bills); $i++) {
            if ($this->counters[$i] != 0) {
                echo '<br>' . $this->bills[$i] . ':&nbsp;&nbsp;' . $this->counters[$i];
            }
        }
    }

}

?>
