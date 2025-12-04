console.log("Loading products.json…");

fetch("products.json")
  .then(res => res.json())
  .then(data => {
    let tbody = document.querySelector("#inventoryTable tbody");

    data.forEach(p => {
      let low = p.quantity < 5 ? "low-stock" : "";

      let row = `
        <tr>
          <td>${p.id}</td>
          <td>${p.name}</td>
          <td>${p.category}</td>
          <td class="${low}">${p.quantity}</td>
          <td>₹${p.price.toFixed(2)}</td>
          <td>${p.expiry}</td>
        </tr>
      `;

      tbody.innerHTML += row;
    });
  });
